import java.io .*;
class Filtre implements FilenameFilter {
public boolean accept (File rep, String nom) {
	if (rep.isDirectory ( ) && nom.endsWith(".pdf")) 
		return true;
	else
	return false;
}
public void affiche(String rep) {
	File fichier = new File (rep); 
	String nomFics [] = fichier.list(new Filtre());
	for (int i = 0; i < nomFics.length; i++)
		System.out.println (nomFics [i]);
	}
}
