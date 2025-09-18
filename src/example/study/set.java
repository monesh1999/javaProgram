package example.study;

import java.util.HashSet;
import java.util.Set;

//set is a type of collection that store group unique element(its don't allow duplicate element)
//set is a interface you can implement treeset,hashset,linkeset
//hashset -> it thoes not make order ,fast for lookups(hashtable
//linkedhash set -> it maintain insertion order slight slow than hashset
//treeset -> maintain element in sorted in natural order(slower than hashset)
public class set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("zoo");
		set.add("apple");
		set.add("zoo");
		set.add("bun");
		
		System.out.println(set);
	}

}
