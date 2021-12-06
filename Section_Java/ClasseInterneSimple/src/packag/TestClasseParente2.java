package packag;

import packag.ClasseParent2.ClasseInterne02;

public class TestClasseParente2 {
	public static void main (String [] args) {
		ClasseParent2 ob_out = new ClasseParent2 ( );
		ClasseInterne02 ob_in = ob_out.new ClasseInterne02 ( );
		System.out.println (ob_in.multiplier ( ));
		System.out.println (ob_out.addition ( ));
		}
}
