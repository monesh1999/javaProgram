package example.study;

import java.util.Scanner;

public class SecondLargeFind {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=obj.nextInt();
		System.out.println("Enter the second number");
		int b = obj.nextInt();
		System.out.println("Enter the Third number");
     	int c = obj.nextInt();
		int lar,sec;
		if(a>b) {
			 lar=a;
			 sec=b;
		 }
		 else {
			 lar=b;
			 sec=a;
		 }
		 if(c>lar) {
			 sec=lar;
		 }
		 else {
			 sec=c;
		 }
		 System.out.println(sec);
//---------------------------------------------------------------
//		Scanner obj = new Scanner(System.in);
//		do {
//		System.out.println("Enter the first number:");
//		int a=obj.nextInt();
//		System.out.println("Enter the second number");
//		int b = obj.nextInt();
//		System.out.println("Enter the Third number");
//		int c = obj.nextInt();
//		 
//	
//		if((a > b && a < c) || (a < b && a > c) ) {
//			System.out.println(" A is 2nd greater");
//		}
//		else if((b > a && b < c) || (b < a && b > c)){
//			System.out.println(" b is 2nd greater");
//		}
//		else {
//			System.out.println(" c is 2nd greater");
//		}
//		}while(true);

	}

}
