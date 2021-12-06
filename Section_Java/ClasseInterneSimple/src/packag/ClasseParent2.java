package packag;

public class ClasseParent2 {
	private int x = 10;
	private int y = 20;
	public int addition ( )
	{ 
		ClasseInterne02 obj_in = new ClasseInterne02( );
	return (x + y)+ obj_in .multiplier ( );
	}
	public class ClasseInterne02
	{ 
		public int multiplier ( )
		{ 
			return x*y ;
		}
	}
}
