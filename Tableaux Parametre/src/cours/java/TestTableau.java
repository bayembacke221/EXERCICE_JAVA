package cours.java;

public class TestTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValeurPaire vp = new ValeurPaire();
		int [] tableau1 =  {2,4,6,5,3,8,9,7};
		int [] tableau2 =  {7,9,8,5,3,6,2,4};
		try {
		System.out.println(vp.valeurPaire(tableau1, tableau2));}
		catch(ArrayIndexOutOfBoundsException e) {e.printStackTrace();}
		
		
		

	}

}
