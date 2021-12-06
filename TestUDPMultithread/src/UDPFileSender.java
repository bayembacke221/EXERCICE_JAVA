import java.io.*;
import java.net.*;

public class UDPFileSender
{
    private int segmentID;
    private int reSendCount;
    private byte[] msg, buffer;
    private FileInputStream fileReader;
    private DatagramSocket datagramSocket;
    private int fileLength, currentPos, bytesRead;
    private final int packetOverhead = 106; // packet overhead

    public UDPFileSender(DatagramSocket socket, DatagramPacket initPacket) throws IOException
    {
        msg = new byte[512];
        buffer = new byte[512];
        datagramSocket = socket;

        //setup DatagramSocket with correct Inetaddress and port of receiver
        datagramSocket.connect(initPacket.getAddress(), initPacket.getPort());
        segmentID = 0;
    }

    public void sendFile(File theFile) throws IOException
    {
        fileReader = new FileInputStream(theFile);
        fileLength = fileReader.available();

        System.out.println("*** Filename: " + theFile.getName() + " ***");
        System.out.println("*** Bytes to send: " + fileLength + " ***");

        send((theFile.getName() + "::" + fileLength).getBytes());

        DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
        datagramSocket.receive(reply);

        //waits for receiver to indicate OK to send
        if (new String(reply.getData(), 0, reply.getLength()).equals("OK"))
        {
            System.out.println("*** Got OK from receiver - sending the file ***");

            //outer while to control when send operation comlete
            //inner while to control ACK messages from receiver
            while (currentPos < fileLength)
            {
                bytesRead = fileReader.read(msg);

                Message message = new Message(segmentID, msg, bytesRead);
                System.out.println("Sending segment " + message.getSegmentID() + " with " + bytesRead + " byte payload.");
                byte[] test = serialize(message);

                send(test, bytesRead + packetOverhead);

                currentPos = currentPos + bytesRead;

                //handle ACK of sent message object, timeout of 2 seconds. If segementID ACK is not received
                //resend segment.
                datagramSocket.setSoTimeout(2000);
                boolean receiveACK = false;
                while (!receiveACK)
                {
                    try
                    {
                        datagramSocket.receive(reply);
                    } catch (SocketTimeoutException e)
                    {
                        send(test, bytesRead + packetOverhead);
                        System.out.println("*** Sending segment " + message.getSegmentID() + " with " + bytesRead + " payload again. ***");
                        reSendCount++;
                    }
                    if (new String(reply.getData(), 0, reply.getLength()).equals(Integer.toString(message.getSegmentID())))
                    {
                        System.out.println("Received ACK to segment" + new String(reply.getData(), 0, reply.getLength()));
                        segmentID++;
                        receiveACK = true;
                    }
                }
            }
            System.out.println("*** File transfer complete...");
            System.out.println(reSendCount + " segments had to be resent. ***");
        } else
        {
            System.out.println("Recieved something other than OK... exiting");
        }
    }

    private void send(byte[] message, int length) throws IOException
    {
        DatagramPacket packet = new DatagramPacket(message, length);
        datagramSocket.send(packet);
    }

    private void send(byte[] message) throws IOException
    {
        DatagramPacket packet = new DatagramPacket(message, message.length);
        datagramSocket.send(packet);
    }

    public byte[] serialize(Object obj) throws IOException
    {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
        objectStream.writeObject(obj);
        objectStream.flush();
        return byteStream.toByteArray();
    }
}