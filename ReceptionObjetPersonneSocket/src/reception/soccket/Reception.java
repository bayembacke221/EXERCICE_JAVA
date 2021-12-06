/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception.soccket;

import java.io.BufferedInputStream;
import envoie.personne.*;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bayembacke
 */
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
}
