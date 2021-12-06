package liste.string;

public class ListeString {
	public static boolean existeDans(String mot, String[] liste) {
		for(int i=0;i<liste.length;i++) {
		if(mot.equalsIgnoreCase(liste[i])) {
			return true;
		}}
		return false;
	}
}
