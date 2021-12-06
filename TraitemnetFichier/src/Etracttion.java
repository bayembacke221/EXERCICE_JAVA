import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Etracttion {
	private String tab[];
	private int tableau[];
	
	
	public int[] extraireChiffreFichier(File fichier) throws IOException {
		 ArrayList<Integer> liste=new ArrayList<Integer>();
	  BufferedReader Br=new BufferedReader(new FileReader(fichier));
	  StreamTokenizer st=new StreamTokenizer(Br);
	  int unchiffreTrouve=StreamTokenizer.TT_NUMBER;
	  while(unchiffreTrouve!=StreamTokenizer.TT_EOF) {
		  unchiffreTrouve=st.nextToken();
		  if(unchiffreTrouve==StreamTokenizer.TT_NUMBER) {
			  int s=(int)st.nval;
			  liste.add(s);
			 
		  }
	  }
	  
	  tableau=new int[liste.size()];
	  for(int i=0;i<liste.size();i++) {
		  tableau[i]=liste.get(i);
	  }
	  
	 return tableau;
		
	}
	 public String[] extraireMotFichier(File fichier) throws IOException {
	    	ArrayList<String> liste=new ArrayList<String>();
	    	 BufferedReader Br=new BufferedReader(new FileReader(fichier));
	   	  StreamTokenizer st=new StreamTokenizer(Br);
	   	  int unmotTrouve=StreamTokenizer.TT_WORD;
	   	  while(unmotTrouve!=StreamTokenizer.TT_EOF) {
	   		     unmotTrouve=st.nextToken();
	   		  if(unmotTrouve==StreamTokenizer.TT_WORD) {
	   			   String s=st.sval;
	   			  liste.add(s);
	   			 
	   		  }
	   	  }
	   	 
	   	 tab=new String[liste.size()];
	   	 for(int i=0;i<liste.size();i++) {
	   		 tab[i]=liste.get(i);
	   	 }
	    	
			return tab;
	    	
	    }
	 public void printArray() {
		 for(int i=0;i<tab.length;i++) {
			 System.out.println(tab[i]+"");
		 }
		 System.out.println(" ");
		 for(int i=0;i<tableau.length;i++) {
			 System.out.println(tableau[i]+""); 
		 }
		 
	 }


}