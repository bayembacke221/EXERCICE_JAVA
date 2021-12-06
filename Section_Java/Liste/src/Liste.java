import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.io.*;
public class Liste {

	public static void main(String[] args) {
		System.out.println("-------------Liste_ordonnee-----------------------");
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(12);//->[12]
		myList.add(0);//->[12,0]
		myList.add(32);//->[12,0,32]
		myList.add(2,5);//->[12,0,5,32]
		myList.set(0, 27);//->[27,0,5,32]
		myList.remove(2);//->[27,0,32]
		System.out.println(myList);//->[27,0,32]
		System.out.println("-------------Collection_non_ordonnee-----------------------");
		Set<String> ingredients = new HashSet<String>();
		ingredients.add("eggs");
		ingredients.add("sugar");
		ingredients.add("butter");
		ingredients.add("salt");
		System.out.println(ingredients);
		ingredients.add("chocolate");
		System.out.println("New Ingredients"+ingredients);
		ingredients.remove("salt");
		System.out.println("New Ingredients"+ingredients);
		System.out.println("-------------Dictionnaire-----------------------");
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Malang", 22);
		myMap.put("Lahad", 21);
		myMap.put("Mohamet", 23);
		myMap.put("Dethie", 23);
		System.out.println(myMap.get("Mohamet")+"ans");

	}

}
