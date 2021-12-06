package test.interfac;

public class TestCalculatrice {
	public static void main(String [] args) {
		Calculatrice cal= new Carre();
		cal.racineCarre(16);
		cal.afficheRacine();
		cal.puissance(4,3);
		cal.affichePuissance();
		
	}
}
