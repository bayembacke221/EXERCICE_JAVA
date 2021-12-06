package Recherche.Chaine;

public class TestRechercheChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1= new String("la mer bleue le jour et rouge a cause des algues");
		String st12= new String("la mer bleue le jour ");
		System.out.println(RechercheChaine.trouveChaine(st1,st12));
	}

}
