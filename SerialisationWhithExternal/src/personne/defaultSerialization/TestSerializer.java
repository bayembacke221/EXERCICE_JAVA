/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne.defaultSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author bayembacke
 */
public class TestSerializer {
    public static void main (String args [ ] ){
    Personne c = new Personne ("X","Malcom",178);
    try {
    File f = new File ("/home/bayembacke/Documents/Personne/personne2.txt");
    FileOutputStream fos = new FileOutputStream ( f );
    java.io.ObjectOutput oos = new ObjectOutputStream (fos);
    c.writeExternal (oos); //objet serialisé
    FileInputStream fis = new FileInputStream ( f );
    ObjectInputStream ois = new ObjectInputStream ( fis );
    c.readExternal ( ois ); //objet désérialisé
    }
    
    catch (Exception enn) {System.out.println ("Erreur main"); }
    }
}
    

