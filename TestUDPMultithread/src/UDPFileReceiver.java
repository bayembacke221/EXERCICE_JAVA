import java.io.*;
import java.net.*;
import java.util.*;

public class UDPFileReceiver
{
    private byte[] buffer;
    private Message receiveMSG;
    private DatagramSocket socket;
    private String filename, initString;
    private FileOutputStream fileWriter;
    private DatagramPacket initPacket, receivedPacket;
    private int bytesReceived, bytesToReceive, simulateBadConnection, expectedSegmentID;
    private final boolean simulateMessageFail = false;//true if you want to simulate a bad connection

    public UDPFileReceiver(DatagramSocket socket) throws IOException
    {
        this.socket = socket;
        buffer = new byte[618];  //618 is the size of my message object. 512 payload, 106 overhead

        System.out.println("*** Ready to receive file on port: " + socket.getLocalPort() + " ***");

        initPacket = receivePacket();
        initString = "Recieved-" + new String(initPacket.getData(), 0, initPacket.getLength());

        //get the file name and byte size of file name
        StringTokenizer t = new StringTokenizer(initString, "::");
        filename = t.nextToken();
        bytesToReceive = new Integer(t.nextToken()).intValue();

        System.out.println("*** The file will be saved as: " + filename + " ***");
        System.out.println("*** Expecting to receive: " + bytesToReceive + " bytes ***");

        //tell the sender OK to send data
        send(initPacket.getAddress(), initPacket.getPort(), ("OK").getBytes());

        fileWriter = new FileOutputStream(filename);

        //two while loops. First checks that there is still more data to receive
        //and inner do/while is to error check on received packets and catch missing ACK
        //sent to sender
        while (bytesReceived < bytesToReceive)
        {
            receiveMSG = new Message();
            do
            {
                receivedPacket = receivePacket();
                try
                {
                    receiveMSG = (Message) deserialize(receivedPacket.getData());
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("*** Message packet failed. ***");
                }

                //logically if the last ACK sent fails to be received the UDPSender will resend the last segment.
                //A simple check on the segemntID will catch this as it will be equal to expectedID - 1. Resending the ACK
                //for this previous segment will eventually get through to the server to send the next expected segment.
                if ((expectedSegmentID - 1) == receiveMSG.getSegmentID())
                {
                    String ACK = Integer.toString(receiveMSG.getSegmentID());
                    send(initPacket.getAddress(), initPacket.getPort(), (ACK).getBytes());
                    System.out.println("*** Resending ACK for segment " + ACK + " ***");
                }

                if (simulateMessageFail)
                {
                    simulateBadConnection = (Math.random() < 0.98) ? 0 : 1; //simulate a 2% chance a message object is lost
                }

                //by adding 1 to segmentIDExpected we can make the receiver determine a message object is lost
                //as the server has a 2 second timeout before it will resend we can check the error control in this way.
            } while (receiveMSG.getSegmentID() != (expectedSegmentID + simulateBadConnection));

            expectedSegmentID++;

            //handles the last byte segmentID size .getBytesToWrite()
            fileWriter.write(receiveMSG.getPacket(), 0, receiveMSG.getBytesToWrite());

            System.out.println("Received segmentID " + receiveMSG.getSegmentID());

            //adding payload size for outer while condition
            bytesReceived = bytesReceived + 512;

            //simulate a 2% chance an ACK is lost
            if (simulateMessageFail)
            {
                if ((Math.random() < 0.98))
                {
                    String ACK = Integer.toString(receiveMSG.getSegmentID());
                    send(initPacket.getAddress(), initPacket.getPort(), (ACK).getBytes());
                } else
                {
                    System.out.println("*** failed to send ACK ***");
                }
            } else
            {
                String ACK = Integer.toString(receiveMSG.getSegmentID());
                send(initPacket.getAddress(), initPacket.getPort(), (ACK).getBytes());
            }
        }
        System.out.println("*** File transfer complete. ***");
        fileWriter.close();
    }

    private DatagramPacket receivePacket() throws IOException
    {
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        return packet;
    }

    private void send(InetAddress recv, int port, byte[] message) throws IOException
    {
        DatagramPacket packet = new DatagramPacket(message, message.length, recv, port);
        socket.send(packet);
    }

    private Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException
    {
        ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectStream = new ObjectInputStream(byteStream);
        return (Message) objectStream.readObject();
    }
}