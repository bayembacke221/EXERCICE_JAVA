
public class ChaineInverse {
	public static String inverseString(String chaine) {
        StringBuilder result = new StringBuilder();
        for (int i = chaine.length() - 1; i >= 0; i--) {
            result.append(chaine.charAt(i));
        }
        return result.toString();
    }
	public void imprime() {
		System.out.println("L'inversion avec succes: "+inverseString(null));
	}
}
