/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaie.comparator;

import java.util.Comparator;

/**
 *
 * @author bayembacke
 */
public class Etudiant   {

    private final String nom;
     private final String prenom;
     private final String numero;

    public Etudiant(String nom, String prenom, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumero() {
        return numero;
    }
    public static class SortName implements Comparator <Etudiant>{
        @Override
        public int  compare(Etudiant o1, Etudiant o2){
             int prenomCompare = o1.getNom().compareTo(o2.getNom());
             if(prenomCompare!=0){
                 return prenomCompare;
             }
             else 
                 return o1.getPrenom().compareTo(o2.getPrenom());
         }

     }
}