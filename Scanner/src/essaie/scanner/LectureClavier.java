package essaie.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureClavier {
	public static void main (String [ ] args) {
	InputStreamReader isr = new InputStreamReader (System. in );
	BufferedReader dis = new BufferedReader (isr); 
	System.out .print ("saisir une chaine") ;
	String ligne_lue ="";
	try{ 
		ligne_lue = dis.readLine () ; 
		try { String k =  String.valueOf(ligne_lue); 
		System. out .println("valeur chaine lue ="+k) ;
		int v = Integer.parseInt(k);
		System. out .println("valeur entiere lue ="+v); 
		}
		catch (NumberFormatException g ){
		System. err .print ("Format de nombre incorrect") ;
		}
	}
	
	catch (IOException e) {
	System. err .print ("Erreur lecture") ;}

	}
}
