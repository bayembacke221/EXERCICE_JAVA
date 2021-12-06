package essaie.tri;


import java.util.*;

public class TriSet {
	public static void main (String [] args) {
		TreeSet <String> list = new TreeSet <String> () ;
		list.add ("I ") ;
		list.add ("am") ;
		list.add ("a") ;
		list.add("black");
		list.add("man");
		Iterator <String> iter =  list.iterator () ;
		while ( iter.hasNext () )
		{
			String o = iter.next () ;
		System.out .println ("element "+o) ;
		}
		}
}
