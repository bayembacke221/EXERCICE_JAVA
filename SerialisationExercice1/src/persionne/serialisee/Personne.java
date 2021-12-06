/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persionne.serialisee;

/**
 *
 * @author bayembacke
 */
public class Personne implements java.io.Serializable {
    private  String nom;
    private String prenom;
    private int taille;

    public Personne(String nom, String prenom, int taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTaille() {
        return taille;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    
    
}
