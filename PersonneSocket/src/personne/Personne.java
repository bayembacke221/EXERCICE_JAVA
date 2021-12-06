package personne;

import java.io.Serializable;

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
