package example.study;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
        // linklist is data type it use store and display throw doble linked list (mean address,data)     
		//<> - typescript
		
		// LinkedList in Java
		// - Dynamic in size (no need to define size in advance)
		// - Efficient insertion and deletion (no shifting required)
		// - Stores element data + reference (node-based structure)
		// - Slow access (no random access, must traverse nodes)
		// - Extra memory needed for storing pointers (less memory efficient)

		LinkedList<String> cars = new LinkedList<String>();
		cars.add("bmw");
		cars.add("toyato");
		cars.add("Tata");
		System.out.println(cars);
		
		cars.addFirst("audi");
		cars.addLast("Ford");
		System.out.println(cars);
		cars.removeFirst();
		cars.removeLast();
		
		System.out.println(cars);
		
		System.out.println(cars.contains("bmw"));
		System.out.println(cars.isEmpty());
	//	cars.clear();
		System.out.println(cars+" 1");
		//converting linkedlist into array
				Object[] a = cars.toArray();
				System.out.println(" afte convert");
				for(Object element:a) {
					System.out.println(element+" ");
				}
		
	}

}
