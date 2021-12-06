
 public class ExtraireChaine {
	private static int compt;
	public static int extraireSousChaine (String chaine, String sousChaine) {
		compt=0;
		for(int i=0; i<chaine.length();i++) {
			if(chaine.indexOf(sousChaine)!=-1)
				 compt++;
		}
		return compt;
	}
	public static int [] extraireChiffres (String s) {
		StringBuffer stb = new StringBuffer();
		int r[] = new int[stb.length()];
		for(int i=0; i<s.length();i++) {
			if(Character.isDigit(s.charAt(i)))
				stb = stb.append(s.charAt(i));
			for(int j=0; j<r.length;j++) {
				r[j] = Integer.parseInt(stb.deleteCharAt(i)+"");
			}
		}
		return r;
	}
}
