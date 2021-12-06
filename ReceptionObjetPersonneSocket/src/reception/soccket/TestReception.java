/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception.soccket;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import envoie.personne.Personne;

/**
 *
 * @author bayembacke
 */
public class TestReception {
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