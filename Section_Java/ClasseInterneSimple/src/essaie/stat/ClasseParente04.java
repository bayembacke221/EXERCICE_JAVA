package essaie.stat;

public class ClasseParente04 {
	
		private static int x = 1, y = 2;
		private int z = 3;
		public int addition ( ){ 
			return x + y + z;}
		public static int multiplier( ){ 
			return x*y;}
		public static class Interne04{
			private static int k = 1;
			private int p = 2;
			public static void imprimer(){
				System.out.println ( multiplier ( ) / (x+y+k) );
			} 
			public void diviser (){ 
				System.out.println (new ClasseParente04( ).addition ( )/(p+x+y));
			}
		}
		
			
		
}		

