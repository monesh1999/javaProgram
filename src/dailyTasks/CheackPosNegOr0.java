package dailyTasks;

import java.util.Scanner;

public class CheackPosNegOr0 {
	
	static  String check(int a) {
		if(a>0) {
			return "Postive number";
		}
		else if(a<0) {
			return "negative number";
		}
		else {
			return "zero";
		}
	}
	static void mmm() {
		System.out.println("hello");
	}
	
	

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = obj.nextInt();
		
		//use only if statement to check number positive ,negative and zero
		if(a>0) {
			System.out.println("POSITIVE NUMBER");
		}
		if(a<0) {
			System.out.println("NEGATIVE NUMBER");
		}
		if(a==0) {
			System.out.println("Zero");
		}
		
		System.out.print(check(a));
		
		
		obj.close();
		

	}

}
