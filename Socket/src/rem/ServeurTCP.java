package rem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTCP {
	ServerSocket server = null;
	Socket client = null;
	PrintWriter out = null;
	BufferedReader in = null;
	String line;
	ServeurTCP ( ) { 
	try {
	server = new ServerSocket (4444);
	}
	catch (IOException e) {
	System.out.println ("Could not listen on port 4444");
	System.exit (-1);


}
	try {System.out.println ("Serveur en attente sur le port: "+server.getLocalPort ( ));
	client = server.accept ( );
	System.out.println ("Traitement avec le client "+client.getRemoteSocketAddress());
	}
	catch (IOException e) {
	System.out.println("Accept failed: 4444");
	System.exit(-1);
	}
	try {
	in = new BufferedReader (new InputStreamReader (client.getInputStream ( )));
	out = new PrintWriter (client.getOutputStream ( ), true);
	} 
	catch (IOException e) {
	System.out.println ("flux errone");
	System.exit(-1);
	}
	try { String mesrecu = in.readLine ( );
	if (mesrecu!= null) out.println ("Merci de votre visite, j' ai bien reçu:"+mesrecu) ; 
	}
	catch (IOException e) { 
	System.out.println ("Read failed");
	System.exit (-1);
	}
	
	try { in.close ( );
	out.close ( );
	server.close ( );
	}
	catch (IOException e) { System.out.println ("Could not close."); System.exit(-1);}
	} 
	public static void main (String a [ ]){
	new ServeurTCP ( );
	}
	} // fin de la classe server
