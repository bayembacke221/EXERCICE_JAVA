/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persionne.serialisee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bayembacke
 */
public class DeserializerPersonne {
    public void  DeserializerUnePersonne(File file){
        ArrayList<Personne> personne = new ArrayList<>();
        try{
            FileInputStream fileinputstream = new FileInputStream(file);
            ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
            
                    personne=(ArrayList) objectinputstream.readObject();
            System.out.println("La personne qui etait serialisee est:");
            
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException cnfex){
            cnfex.printStackTrace();
        } 
        for (Iterator<Personne> it = personne.iterator(); it.hasNext();) {
            Personne name = it.next();
            System.out.println(name.getPrenom()+" "+name.getNom()+" "+name.getTaille());
        }
    }
}
