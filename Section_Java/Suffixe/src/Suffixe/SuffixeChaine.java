package Suffixe;

public class SuffixeChaine {
	public static boolean estSuffixe (String u, String v) {
		for(int i=0; i<u.length();i++) {
			if(u.endsWith(v))
				return true;
		}
		return false;
	}
	public static String extraire (String s, int début, int fin) {
		String res=s.substring(début, fin);
		return res;
	}
}
