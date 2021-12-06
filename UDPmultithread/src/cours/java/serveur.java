package cours.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class serveur extends Thread{

	protected BufferedReader in;
	protected PrintWriter out;
	private Socket soc;
	String s;

	public serveur(Socket soc) {
		try {
			this.soc=soc;
			this.in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			this.out = new PrintWriter(soc.getOutputStream(), true);
		} catch (Exception e) {
			System.out.println("Probleme lors de l'ecoute");
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			try {
				traitement();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interruption grave du processus");
			}
		} catch (Exception er) {
		}
	}
	public String reception() {
		try {
			while(true) {
			System.out.println("Serveur en attente de client!!!");
			s=soc.getInputStream().toString();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	private void traitement() {
		try {
			in = new BufferedReader (new InputStreamReader (soc.getInputStream ()));
			out = new PrintWriter (soc.getOutputStream (), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try { 
			String ch = in.readLine();
			if (ch != null) 	
				out.println ("Transposition de votre message : "+new StringBuffer(ch).reverse().toString());
		}catch (IOException e) {
			System.out.println ("Read failed");
			System.exit (-1);
		}
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[ ] args)
			throws java.net.SocketException,java.io.IOException
	{ 
		java.net.DatagramSocket socket = new java.net.DatagramSocket (4008);
	byte sendbuffer [ ] = null; byte receivebuff [ ] = new byte [256]; 
	java.net.DatagramPacket receivepacket = new java.net.DatagramPacket
			(receivebuff,receivebuff.length);
	java.net.DatagramPacket sendpacket = null; 
	System.out.println ("Serveur UDP prêt . ");
	socket.receive (receivepacket); 
	System.out.println ("Données reçues : "+ new String (receivepacket.getData()));
      java.net.InetAddress 
	adr = receivepacket.getAddress ( );
      
      int port = receivepacket.getPort ( );
      sendbuffer = ("vous êtes connecté depuis la machine "+adr +"et sur le port "+port).getBytes();
      sendpacket = new java.net.DatagramPacket (sendbuffer,sendbuffer.length,adr,port);
      socket.send (sendpacket); 
      }
}
