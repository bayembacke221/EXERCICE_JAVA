package essaie.tri;
import java.util.Scanner;
public class TestTriStringSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la taille du tableau");
		int n=sc.nextInt();
		int t[]=new int [n];
		System.out.println("donner la nombres d'entier");
		for(int i=0;i<t.length;i++){
			
				t[i]=sc.nextInt(i);
			}
		TriStringSimple.invers(t);
		TriStringSimple.affiche();
	}

}


