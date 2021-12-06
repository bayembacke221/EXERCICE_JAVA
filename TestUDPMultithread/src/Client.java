import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;


public class Client
{

    private static byte[] buffer;
    private static int port = 8550;
    private static DatagramSocket socket;
    private static BufferedReader stdin;
    private static StringTokenizer userInput;
    private static DatagramPacket initPacket, packet;

    public static void main(String[] args) throws IOException
    {
        socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");

        buffer = new byte[618];

        stdin = new BufferedReader(new InputStreamReader(System.in));

        String selectedAction = selectAction();
        userInput = new StringTokenizer(selectedAction);

        try
        {
            switch (messageType.valueOf(userInput.nextToken()))
            {
                case put:
                    packet = new DatagramPacket((selectedAction).getBytes(), (selectedAction).getBytes().length, address, port);
                    socket.send(packet);

                    File theFile = new File(userInput.nextToken());

                    initPacket = receivePacket();

                    //create object to handle out going file
                    UDPFileSender fileHandler = new UDPFileSender(socket, initPacket);
                    fileHandler.sendFile(theFile);
                    break;


                case get:
                    packet = new DatagramPacket((selectedAction).getBytes(), (selectedAction).getBytes().length, address, 8550);
                    socket.send(packet);

                    initPacket = receivePacket();

                    socket.send(initPacket);

                    //create Object to handle incoming file
                    new UDPFileReceiver(socket);
                    break;
            }
        } catch (Exception e)
        {
            System.err.println("not valid input");
        }

        socket.close();
    }

    private static DatagramPacket receivePacket() throws IOException
    {
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        return packet;
    }

    public static String selectAction() throws IOException
    {
        System.out.println("COMMANDS: get *filename*");
        System.out.println("\t  put *filename*");
        System.out.println("\t  example: put data.txt");
        System.out.print("ftp> ");

        return stdin.readLine();
    }

    public enum messageType
    {
        get, put;
    }
}
