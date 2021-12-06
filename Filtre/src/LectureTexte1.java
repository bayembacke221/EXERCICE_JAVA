import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class LectureTexte1 {
	public static void main (String[] args) {
	FileReader flux=null; 
	BufferedReader filtre=null;
	try {
			flux = new FileReader ("./bin/file.txt"); 
			filtre=new BufferedReader (flux);
		} 
	catch (FileNotFoundException e) {e.printStackTrace(); }
	String k;
	try {
		k = filtre.readLine();
		while (k!=null){
			System.out.println(k);
			k=filtre.readLine();
		}
		} 
	catch (IOException e) {e.printStackTrace(); }
	finally {
		try {filtre. close( ); flux.close();} 
		catch (IOException e) {e.printStackTrace ();
			}
		}
	}
}
