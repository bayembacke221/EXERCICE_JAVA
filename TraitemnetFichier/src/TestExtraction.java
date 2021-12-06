import java.io.File;
import java.io.IOException;

public class TestExtraction {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		File fichier=new File("/home/bayembacke/Documents/fichier.txt");
		Etracttion essai=new Etracttion();
		essai.extraireMotFichier(fichier);
		essai.extraireChiffreFichier(fichier);
		essai.printArray();
		System.out.println(" ");
		
		
		

	}
}
