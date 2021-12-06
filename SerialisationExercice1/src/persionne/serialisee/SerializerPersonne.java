/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persionne.serialisee;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author bayembacke
 */
public class SerializerPersonne {
    public File SerializerUnePersonne(ArrayList <Personne> personne){
        File file =new File("/home/bayembacke/Documents/Personne/personne.txt");
        try{
            ObjectOutputStream objectoutputstream = new 
            ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file,true)));
            objectoutputstream.writeObject(personne);
            objectoutputstream.flush();
            objectoutputstream.close();
            
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return file;
    }
}
