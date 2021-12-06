package test.interfac;

public class Carre implements Calculatrice{
	private double x;
	private  double puissance;
	@Override
	public double racineCarre(double nombre) {
		
		return this.x=(Math.sqrt(nombre));
	}

	@Override
	public void afficheRacine() {
		// TODO Auto-generated method stub
		System.out.println(this.x);
		
	}

	@Override
	public double puissance(int val, int degre) {
		 this.puissance=Math.pow(val, degre);
		return this.puissance;
	}

	@Override
	public void affichePuissance() {

		System.out.println("La puissance est: "+this.puissance);
	}

}
