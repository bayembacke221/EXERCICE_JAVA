package compte;

public class CompeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte C1= new Compte("Malcolm","X",200000);
		Compte C2= new Compte("Mbaye","Mbacke",2000000, 3000000);
		C1.consulter();
		C1.deposer(20000);
		System.out.println("********************************************************");
		C2.consulter();
		C2.deposer(509000);
		C2.retirer_argent(40000);
		
		
		

	}

}
