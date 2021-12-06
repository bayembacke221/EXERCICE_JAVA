package interne.simple;

import interne.simple.ClasseParente.ClasseInterne;

public class TestClasseParente {

	public static void main (String [] args) {
		ClasseParente ob_out = new ClasseParente ( );
		ClasseInterne ob_in = ob_out.new ClasseInterne ( );
		System.out.println (ob_in.multiplier ( ));
		}

}
