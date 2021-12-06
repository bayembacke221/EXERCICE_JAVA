import java.util.StringTokenizer;
public class Chaine {
	static String tab[];
	public static String[] def(String s) {
		int n = 0,i=0 ;
		
		StringTokenizer st = new StringTokenizer(s, ",;:. " );
		n = st.countTokens();
		tab= new String[n];
		while(i<n)
		{
			tab[i] = st.nextToken();
			i++;
		}
		return tab;
	
	}
	public static void affiche() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]+"");
		}
		
	}
}
