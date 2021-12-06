/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envoie.personne;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author bayembacke
 */
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
}
