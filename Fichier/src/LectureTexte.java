import java.io.FileNotFoundException; 

import java.io.FileReader;
import java.io.IOException;
public class LectureTexte {
public static void main(String[] args) {
java.io.FileReader flux=null;
try {
		flux = new FileReader ("./bin/file.txt");
	} 
	catch (FileNotFoundException e) {e.printStackTrace(); }
	int k;
	try {
		k = flux.read();/*la methode read lis caractere par 
		caractere et renvoie a la fin -1*/
		while (k!=-1){
			System.out.println((char)k);
			k=flux.read();
		}
	} 
	catch (IOException e) {e.printStackTrace(); }
	finally {
		try {flux.close();} 
		catch (IOException e) {e.printStackTrace ();
		}
	}
	

	}
}