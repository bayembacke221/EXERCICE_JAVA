package essaie.voyelle;

public class TabVoyelle {
	static char [] caractere;
	public static char [] tableauCaractere(String chaine) {
		int taille = chaine.length();
		StringBuffer stb = new StringBuffer();
		for(int i=0; i<taille; i++) {
			if(chaine.charAt(i)=='a'||chaine.charAt(i)=='o'
			   ||chaine.charAt(i)=='e'||chaine.charAt(i)=='u'
			   ||chaine.charAt(i)=='y'||chaine.charAt(i)=='i') {
				stb = stb.append(chaine.charAt(i));
			}
		}
		return caractere = stb.toString().toCharArray();
	}
	public static void affiche() {
		for(int i=0; i<caractere.length; i++) {
			System.out.println(caractere[i]);
		}
	}
}
