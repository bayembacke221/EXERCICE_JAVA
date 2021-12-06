import java.util.Scanner;
public class TestTableau {

	public static void main(String[] args) {
		
		Scanner clavier= new Scanner(System.in);
		int  tab[]=new int [5];
		
		int i;
		int n=0;
		for ( i=0;i<tab.length;i++) {
			System.out.println("Initialisation de tableau");
			 n=clavier.nextInt();
			 tab[i]=n;
		}
		for(i=0; i<tab.length;i++) {
			
			System.out.println("Le tableau: "+tab[i]);
		}
		System.out.println("--------------");
		for ( i=0; i<tab.length;i++) {
			int tmp;
			tmp=tab[i]%(tab.length);
			System.out.println("Le tableau: "+tmp);
		}

	}

}
