package interne.simple;

public class ClasseParente {
	private int x = 10;
	private	static int y = 20;
	public int addition () { 
		return (x + y);
	}
	public  class ClasseInterne
	
	{ 
		 int p = 20; 
		static final int k = 12;
		public int multiplier ( )
		{ 
			return x*y + addition ();
		}
	} 
	
}
