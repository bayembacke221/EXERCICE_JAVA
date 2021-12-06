import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import personne.Personne; 

public class Reception {
	Socket sock;
	ServerSocket s;
	BufferedInputStream tampon;
	ObjectInput lu;
	public Reception (ServerSocket s) {
	try{
	this.s = s;
	sock = this.s.accept () ;//bloquant
	tampon = new BufferedInputStream (sock.getInputStream ( ));
	lu = new ObjectInputStream (tampon);
	}
	catch (Exception er){}
	}
	public File recevoir () throws IOException{
	try{
	Personne p = (Personne) lu.readObject() ;
	return new Serializer().SerializerUnePersonne(p);
	
	}
	catch ( Exception e){ return null;}
	finally {
		lu.close () ;
	}
	}
	public static void main (String[] args) {
	try {
	Reception r = new Reception (new java.net.ServerSocket (4444));
	File f = r.recevoir ();
	FileInputStream fic = new FileInputStream (f);
	ObjectInputStream ois = new ObjectInputStream (fic);
	Personne p = (Personne) ois.readObject ();
	System.out .println (p.getFirstname() ) ;
	System.out .println (p.getLastname () ) ;
	}
	catch (Exception e){ e.printStackTrace();}
}
}
