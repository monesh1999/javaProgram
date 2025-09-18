package example.study;

import java.util.ArrayList;
import java.util.Collections;
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
        min.add(800); 
        min.add(400); 
        min.add(700); 

        System.out.println(min); // [100, string]
        
        Collections.copy(min,a);
        System.out.println(a);
        
        Collections.shuffle(min);
        System.out.println(min);
        
        Collections.reverse(min);
        System.out.println(min);
        
        Collections.swap(min,0,3);
        System.out.println(min);
        
        Collections.sort(a); // sorts in ascending order
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder()); // sorts in ascending order
        System.out.println(a);
        
       
        // Retrieve first element -> typecasting required
        int num = (int) min.get(0);  
        System.out.println(num); // 100

        // Iterator must match the type of ArrayList
        Iterator<Object> it = min.iterator(); 
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
		
		//.hasNext -> returns true if there is another element in the collection
        //it return next element in iteration.
        //if there is more to iteration
        //next move the pointer return the value.
        
        
        
	}

}
