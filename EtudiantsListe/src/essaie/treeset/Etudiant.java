/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaie.treeset;

/**
 *
 * @author bayembacke
 */
public class Etudiant implements Comparable <Etudiant> {

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
   @Override
    public int compareTo (Etudiant v) {
        String n1=v.getNom();
        String n2=this.getNom();
        int k=n2.compareTo (n1);
        if (k==0)
        { 
            String m1=v.getPrenom();
            String m2=this.getPrenom();
            k=m2.compareTo (m1);
        }
        return k;
    }
    
}
