package gestion.compte;

public class CompteBancaire {
		private double solde ;
		private static String nom;
		private static String prenom;
		private static int numero;
		CompteBancaire (double solde, String name,String firsname,int number)
		{ this.solde = solde;
			nom= name;
			prenom= firsname;
			numero= number;
		}
		void deposer ( double montant)
		{ 
			solde +=montant;
		}
		
		public double getSolde() {
			return solde;
		}
		
		public void setSolde(double solde) {
			this.solde = solde;
		}
		
		public static String getNom() {
			return nom;
		}
		public void setNom(String name) {
			nom = name;
		}
		public static String getPrenom() {
			return prenom;
		}
		public void setPrenom(String firstname) {
			prenom = firstname;
		}
		public static int getNumero() {
			return numero;
		}
		public void setNumero(int number) {
			numero = number;
		}
		void retirer (double montant)
		{ if (solde >=montant)
		solde -=montant ;
		}
		public void imprimeHistorique ( ){
		System.out.println (" Votre solde="+solde);
		System.out.println (" Votre nom="+nom);
		System.out.println (" Votre prenom="+prenom);
		System.out.println (" Votre numero="+numero);
		}
}
