package gestion.compte;

public class CompteCheque extends CompteBancaire {
	private double decouvertAutorise;
public CompteCheque (double solde, double decouvertAutorise)
{ 
	super (solde, getNom(), getPrenom(), getNumero()); 
	this.decouvertAutorise = decouvertAutorise;
}

public void retirer (double montant) { 
	if (getSolde() + decouvertAutorise >=montant )
	setSolde(getSolde() - montant) ;
}
public void changeDecouvert (double dec) 
	{ 
		this.decouvertAutorise= dec;
	}
public void imprimeHistorique ( ){
    super.imprimeHistorique();
    System.out.println (" Votre decouvert autorise="+this.decouvertAutorise);
}
}
