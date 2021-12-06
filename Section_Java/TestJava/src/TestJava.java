//package default;
public class TestJava {

	public static void main(String[] args) {
		int[] tab= new int[10];
		for(int i=0; i<tab.length; i++) {
			tab[i]=0;
		}
		for(int v: tab) {
			System.out.println(v);
		}

	}
	
}
