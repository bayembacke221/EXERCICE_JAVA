/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscriptionetudiant;

/**
 *
 * @author bayembacke
 */
public class Etudiant {
    private int id, age;
    public String prenom, nom;

    public Etudiant(int id, int age, String prenom, String nom) {
        this.id = id;
        this.age = age;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    
    
    
}
