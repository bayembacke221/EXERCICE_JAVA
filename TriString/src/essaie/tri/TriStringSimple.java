package essaie.tri;

public class TriStringSimple {
	static int tab[];
	public static int [] invers(int t[]){
		int i=0;
		int l=t.length-1;
		tab=new int [t.length];
		while((i<l) && (l>0))
		{
			tab[i]=tab[l-i];
			i++;
			l--;
		}
		return tab;
	}
	public static void affiche(){
		for(int i=0;i<tab.length;i++){
			System.out.println(""+tab[i]);
			 invers(tab);
			 affiche();
		}
	}
}
