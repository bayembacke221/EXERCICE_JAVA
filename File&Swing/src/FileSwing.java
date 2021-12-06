import javax.swing.*;
import java.io.*;
public class FileSwing {
public void ouvrirFichierEnLecture( ) {
		JFileChooser fileChooser = new JFileChooser ( );
		int retval = fileChooser.showOpenDialog(null); 
		if (retval == JFileChooser.APPROVE_OPTION)
		{
			File fichier = fileChooser.getSelectedFile ( ); 
			String chemin = fichier.getAbsolutePath ( );
			JLabel annonce = new JLabel();
			annonce.setText (" "+chemin);
			if ( fichier.isFile( ) && fichier.canRead ( ))
			lireFichier(fichier);
		}
	}

	public void lireFichier (File nom)
	{
		try { 
			java.io.BufferedReader isr = new BufferedReader ( new
			FileReader (nom));
			String s = isr.readLine (); 
			while (s!= null )
			{ 
				texte.append(s+"\n");
				s = isr.readLine();
			}
			isr.close ( ) ;
		}
		catch (IOException e) {
			JLabel annonce = new JLabel();
			annonce.setText("Erreur de lecture du fichier");}
		}
	

}