
public class TestExtraireChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1= new String("Bonjour x Bonjour");
		String st12= new String("Bonjour");
		System.out.println(ExtraireChaine.extraireSousChaine(st1, st12));
		for(int i=0;i<st1.length();i++) {
			System.out.println(ExtraireChaine.extraireChiffres(st1));
		}
		
	}

}
