package gestion.compte;

public class TestCompte {

	public static void main(String[] args) {
		CompteBancaire cb=new CompteBancaire(0, "Mbacke", "Mbaye", 034);
		cb.deposer(50000);
		cb.imprimeHistorique();
		CompteCheque cc= new CompteCheque(0, 0);
		cc.deposer(250000);
		cc.changeDecouvert(50000);
		cc.retirer(65000);
                System.out.println("------------------");
		cc.imprimeHistorique();

	}

}
