import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import personne.Personne;

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
