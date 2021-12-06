import java.io.BufferedOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;


import personne.Personne;

public class Envoi implements java.io.Serializable{
	Socket sock;
	BufferedOutputStream tampon;
	ObjectOutput ecrit;
	public Envoi (Socket sock) {
	try {
	this.sock = sock;
	tampon = new BufferedOutputStream( sock.getOutputStream ());
	ecrit = new ObjectOutputStream(tampon);
	}
	catch (Exception er){ er.printStackTrace();}
	}
	public void envoyer (Personne p){
		try {
		ecrit.writeObject (p);
		ecrit.flush ();
		}
		catch (Exception e){e.printStackTrace();}
	}
	public static void main (String [ ] args) {
	try {
	Personne p = new Personne("Joe", "NDONG", 123);
	Envoi e = new Envoi( new Socket("localhost", 4444));
	e.envoyer(p);
	}
	catch (Exception d ) { d.printStackTrace();}
}
}
