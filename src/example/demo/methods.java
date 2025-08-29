package example.demo;

import java.util.Scanner;

public class methods {
	
	static int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	
	void hello() {
		System.out.println("Hello Welcome to home");
	}

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		methods obj1 = new methods();
		
		System.out.println("Enter the number ");
		int a = obj.nextInt();
		System.out.println("Enter the number ");
		int b = obj.nextInt();
		
		
		

	}

}
