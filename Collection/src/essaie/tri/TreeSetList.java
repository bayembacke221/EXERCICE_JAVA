package essaie.tri;


import java.util.*;

public class TreeSetList {
	public static void main (String [] args) {
		TreeSet <Integer> list = new TreeSet <Integer> () ;
		list.add (100) ;
		list.add (29) ;
		list.add (0) ;
		list.add(100);
		list.add(2);
		Iterator iter =   list.iterator () ;
		while ( iter.hasNext () )
		{
			Integer o = (Integer) iter.next () ;
		System.out .println ("element "+o) ;
		}
		}
}
