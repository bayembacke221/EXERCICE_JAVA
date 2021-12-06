import java.io.*;
import java.net.*;

public class Server
{
    private static int clientID = 1;
    private static DatagramSocket serverSocket;

    public static void main(String[] args) throws IOException
    {
        System.out.println("Server started.");
        byte[] buffer = new byte[512];

        
        serverSocket = new DatagramSocket(8550);
        while (true)
        {
            try
            {
                DatagramPacket packet =  new DatagramPacket(buffer, buffer.length );
                serverSocket.receive(packet);
                System.out.println("SERVER: Accepted connection.");
                System.out.println("SERVER: received"+new String(packet.getData(), 0, packet.getLength()));

                
                DatagramSocket threadSocket = new DatagramSocket();

                Thread t = new Thread(new CLIENTConnection(threadSocket, packet, clientID++));

                t.start();

            } catch (Exception e)
            {
                System.err.println("Error in connection attempt.");
            }
        }
    }
}