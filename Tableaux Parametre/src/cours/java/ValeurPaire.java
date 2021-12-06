package cours.java;

public class ValeurPaire {
	public int [] valeurPaire(int [] tableau1,int [] tableau2) {
		
		int cpt=0;
		int [] tableauxfinal = new int [cpt];
		for(int i = 0; i<tableau1.length;i++) {
				if(tableau1[i]%2==0) {
					tableauxfinal[cpt]=tableau1[i];
				}
				cpt++;
			
		}
		
		
		
		return tableauxfinal;
	}
}
