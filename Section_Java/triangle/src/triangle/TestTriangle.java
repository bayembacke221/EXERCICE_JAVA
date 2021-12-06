package triangle;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle DT = new Triangle();
		Scanner clavier=new Scanner(System.in);
		int nbre = 0;
		int essai= 0;
		do 
		{
			System.out.println("Entrer la taille svp: ");
			nbre=clavier.nextInt();
	 
	    	if(nbre<3 || nbre>10)
	    	{
	    		essai++;
	    	}
	    	else
	    	{
	    		int choix = 0;
	    		System.out.println(""
	    				+ "choisie l'orientation du triangle:\n"
	    				+ " 0:orientation en bas\n "
	    				+ "1:orientation en haut");
	    		choix=clavier.nextInt();
	    		if(choix==0)
	    		{
	    			DT.dessineTriangleBas(nbre);
	    		}
	    		else
	    		{
	    		DT.dessineTriangleHaut(nbre);
	    		}
	    		System.exit(0);
	    	}
	    	
		} while(essai<3);
	    System.out.println("Trop de tentative nombre d'essai epuise");
		clavier.close();
	}
	
}
