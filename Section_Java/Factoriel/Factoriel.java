import java.util.Scanner;
/**
 * Factoriel
 */
public class Factoriel {

    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int nombre;
        int essai= 0;
        int fact=1;
        while(essai<3) {
        	System.out.println("donner un entier entre 3 et 15");
		    nombre=clavier.nextInt();
	        if(nombre<3 || nombre>15)
	    	{
	    		essai++;
	    	}
	    	else {
	    		for(int i=1 ;i<=nombre;i++) {
	    			fact=fact*i;
	    			
	    		}
    				System.out.println("Le factoriel de ce nombre est:"+fact);
	    	}
        }
	    System.out.println("Trop de tentative nombre d'essai epuise");
		clavier.close();
    }
}