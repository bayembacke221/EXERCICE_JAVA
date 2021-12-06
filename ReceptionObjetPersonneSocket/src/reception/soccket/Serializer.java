/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception.soccket;

/**
 *
 * @author bayembacke
 */

import java.io.BufferedOutputStream;
import envoie.personne.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author bayembacke
 */
public class Serializer {
    public File SerializerUnePersonne(Personne personne){
        File file =new File("/home/bayembacke/Documents/Personne/test.txt");
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