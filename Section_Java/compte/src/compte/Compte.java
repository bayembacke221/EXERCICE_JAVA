package compte;

public class Compte {
	private String nom;
	private String prenom;
	private double solde;
	private double decouvert_initial;
	private double retrait;
	public Compte(String n, String p, double s) {
		this.nom=n;
		this.prenom=p;
		this.solde=s;
	}
	public Compte(String nom, String prenom, double solde, double d_i) {
		this(nom, prenom, solde);
		this.decouvert_initial=d_i; 
	}
	public void consulter() {
		System.out.println("Votre Prenom est:"+this.prenom);
		System.out.println("Votre Nom est:"+this.nom);
		System.out.println("Votre solde est:"+this.solde);
		
	}
	public void deposer(double somme) {
		this.solde=(this.solde+somme);
		System.out.println("Votre nouveau solde est:"+this.solde);
	}
	public double nature_decouvert() {
		if(solde<0) {
			return -solde;
		}
		else {
			return 0;
		}
	}  
	public void retirer_argent(double somme) {
		this.retrait=this.solde-somme;
		if(this.retrait<=this.decouvert_initial && somme>0 ) {
			this.solde=this.retrait;
			System.out.println("Retrait Possible: nouvelle solde"+solde);
		}
		else {
			System.out.println("Retrait impossible: solde insuffisant");
		}
	}
	
	
}
