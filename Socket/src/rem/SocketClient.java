
package rem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient extends Thread {
	Socket socket = null;
	PrintWriter out = null;
	BufferedReader in = null;
	String line;
	SocketClient (){
            try {
                socket = new Socket (InetAddress.getLocalHost( ), 4444);
                out = new PrintWriter (socket.getOutputStream ( ), true);
                in = new BufferedReader( new InputStreamReader (socket.getInputStream ( )));
            }
            catch (UnknownHostException e) {
                System.out.print (" Unknown host:");
            }
            catch (IOException e) {
                System.out.print (" No I/O");
            } 
        }
	public void envoyer (String mes){
            out.println (mes) ;
            System.out .println ("Le client a envoye : "+mes) ;
	}
	public void reception ( ){
            try {
                String rec = in.readLine ( );
                System.out .println("Depuis le serveur: "+rec) ;
            } 
            catch (IOException e){ }
	}
} // fin de la classe client


