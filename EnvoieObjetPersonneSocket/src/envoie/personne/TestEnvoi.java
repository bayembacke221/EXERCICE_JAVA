/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envoie.personne;

import java.net.Socket;

/**
 *
 * @author bayembacke
 */
public class TestEnvoi {
	public static void main (String [ ] args) {
	try {
	Personne p = new Personne("Joe", "NDONG", 123);
	Envoi e = new Envoi( new Socket("localhost", 4444));
	e.envoyer(p);
	}
	catch (Exception d ) { d.printStackTrace();}
}
}
