/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne.defaultSerialization;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author bayembacke
 */
public class Personne implements java.io.Externalizable {
    private String nom ;
    private String prenom ;
    private int taille;
    public Personne (String nom, String prenom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.prenom = prenom;
    }
    public String getNom2 ()
    { return nom; }
    
    public void setNom2 (String nom)
    { this.nom = nom; }
    
    public int getTaille2 ()
    { return taille; }
    
    public void setTaille2 (int taille)
    { this.taille = taille; }
    
    public String getPrenom2 ()
    { return prenom; }
    
    public void setPrenom2 (String prenom) { this.prenom = prenom; }

    public void readExternal (ObjectInput e) {
    try {
        System.out.println("starting reading...");
        System.out.println (e.readObject ( ) );
        System.out.println (e.readObject ( ));
        System.out.println (e.readInt ( ) );
    }
        catch (Exception enn) { System.out.println ("Erreur reading...");
            enn.printStackTrace ( );
        }
    }

    public void writeExternal (ObjectOutput e) {
try {
System.out.println(" starting writing...");
e.writeObject ( this.getNom2( ) );
e.writeObject (this.getPrenom2( ) );
e.writeInt ( this.getTaille2( ) );
e.flush() ;
e.close() ;
System.out.println("finishing writing !!!");
}
catch (Exception enn) { System.out.println ("Erreur reading...");
enn.printStackTrace ( );
}
    }
}
