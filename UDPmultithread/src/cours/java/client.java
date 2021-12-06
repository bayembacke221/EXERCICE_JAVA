package cours.java;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class client extends Thread{

	Socket s;
	Scanner entree=null;
	BufferedReader sin =null;
	PrintWriter sout =null;
	public client ( ){}
	public void run ( )
	{
		try 
		{
			String line;
			while (true) 
			{
				s = new Socket ("localhost",2008);
				Thread.sleep(1000);
				System.out.println ("Connected to  " + s.getInetAddress ( ) + " on port  " + s.getPort( ));
				sin = new BufferedReader (new InputStreamReader(s.getInputStream ( )));
				sout = new PrintWriter (s.getOutputStream ( ), true);
				System.out.print ("[Client Ask] > > >");
				entree = new Scanner (System.in);
				line = entree.nextLine ( );
				if(line.equals("")) 
				{
					s.close() ;
					System.out.println("Client s’arrete");
					break;
				} 
				else 
				{  
					sout.println(line);
					sout.flush() ;
					line = sin.readLine();
					System.out.println("recu du serveur: " + line);
				}
			}	
		}
		catch(Exception dd)
			{
				System.out.println("probleme d'enfrmissement du Thread...");
			}
		finally
		{
			try
			{
				s.close();
			} 
			catch(Exception er){}
		}
	}	

	public static void main(String [ ] args) throws Exception 
	{ java.net.InetAddress adr = java.net.InetAddress.getByName ("localhost");
	java.net.DatagramSocket socket = new java.net.DatagramSocket( );
	byte buf [ ]="Bonjour".getBytes ( ); 
	java.net.DatagramPacket sendpacket = new java.net.DatagramPacket (buf,buf.length,adr,4008);
	buf = new byte [256];
	java.net.DatagramPacket receivepacket=new java.net.DatagramPacket(buf,buf.length,adr,4008);
	socket.send (sendpacket);
	socket.receive (receivepacket);
	System.out.println ("Données reçues du serveur. "+new String (receivepacket.getData ( )));
	} 
}
