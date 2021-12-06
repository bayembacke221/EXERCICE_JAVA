/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envoie.personne;
import java.io.Serializable;
/**
 *
 * @author bayembacke
 */
public class Personne implements Serializable{
    String firstname;
    String lastname;
    int taille;
    
	public Personne(String firstname, String lastname, int taille) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.taille = taille;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}

    
    
}
