package example.study;

import java.util.ArrayList;
import java.util.Iterator;
        //array list is array resizie store organiser and mananage the data it is resizeable array but work like a regular array 
		//dose not need to define th siz e of array it grow and shink automal as you add or remove element
		//it allow duplicates
		//it prsisve the order of instion
		

public class arrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(0,500);
		System.out.println(a);
		
		
		// Using Object type -> can store different data types
        ArrayList<Object> min = new ArrayList<>();

        min.add(100);        // Integer (autoboxed)
        min.add("string");   // String

        System.out.println(min); // [100, string]

        // Retrieve first element -> typecasting required
        int num = (int) min.get(0);  
        System.out.println(num); // 100

        // Iterator must match the type of ArrayList
        Iterator<Object> it = min.iterator(); 
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
		
		
	}

}
