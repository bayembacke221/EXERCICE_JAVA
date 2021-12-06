package info.fst.jnd.pro;
import static java.lang.System.out;
import java.util.Scanner;
public class TypesInstructions {

	public static void main(String[] args) {
//		int x=5;
//		int y=2;
//		if (( x<10 ) |( y++ > 4)) { //on évalue x<10 , le résultat
//									// est faux donc on n’ évalue pas
//									// y++ > 4
//				System.out.println("Bloc d'instruction");
//			}
		// instructions après le test
//		x= y-10;
//		System.out.println("la valeur des deux nombres est:"+x+" "+y);
//		byte n = 10 ;
//		int s =n +1 ; // ici on ne peut pas écrire n = n+ 1
//		out.println("Affichage 1 :" + n); // n reste byte
//		out.println("Affichage 2 :"+ s);
//		Scanner clavier = new Scanner (System.in) ;
//		int n;
//		do
//		{ 
//			out.println ("saisir un entier strictement positif " ) ;
//			 n = clavier.nextInt ( ) ; // saisir à partir du clavier
//		if ( n < 0) 
//			out.println ("la saisie est invalidée: recommencez" ) ;
//		}
//		while ( (n < 0) || (n == 0) );
		int tab [ ] = new int [ 10] ; // tableau d’entiers de taille 10
		repeat:for(int i = 0 ; i < 10 ; i ++ )
		{ 
			for(int j=i; j<10; j++) {
				if(j==3|| j==4|| j==5) break repeat;
				tab[j]=j+1;
			}
		}
		// le break nous branche à la sortie du for pour continuer
		for ( int i = 0 ; i < 10 ; i ++ )
		System.out.println ( " éléments du tableau:" + " "+ tab [ i] );

		}
}
			