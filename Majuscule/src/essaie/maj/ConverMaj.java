package essaie.maj;

public class ConverMaj {
	static String chaine1;
	public static String convertionMajuscule(String chaine, char caractere) {
		for(int i=0; i<chaine.length(); i++) {
			if(chaine.charAt(i)==caractere) {
				caractere = Character.toUpperCase(chaine.charAt(i));
				chaine1 = chaine.replace(chaine.charAt(i),caractere);
			}
		}
		return chaine1;
	}
	public static void affiche() {
		System.out.println(chaine1);
	}
}
