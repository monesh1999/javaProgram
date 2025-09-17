package example.study;

import java.util.LinkedList;

class pair{
	int id;
	String name;
	pair(int id, String name){
		this.id=id;
		this.name=name;
		
	}
}
public class LinkedListwithjava {

	public static void main(String[] args) {
		LinkedList<pair> cars = new LinkedList<>();
		cars.add(new pair(1,"many"));
		cars.add(new pair(2,"one"));
		
		for(pair p:cars) {
			System.out.println("ID :"+p.id+" ,name : "+p.name );
		}
		
		
	}

}
