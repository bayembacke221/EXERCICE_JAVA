package Recherche.Chaine;
public class RechercheChaine {
	static boolean trouveChaine (String chaine, String chainerecherche) {
		if(chaine.indexOf(chainerecherche)!=-1) {
			return true;
		}
		return false;
	}
}
