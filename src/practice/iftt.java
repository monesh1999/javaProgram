package practice;

import java.util.Scanner;

public class iftt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the details :");
		int a = obj.nextInt();
		if(a>=50 && a<=100) {
			System.out.println("valid");
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else {
			System.out.println("invaild");
		}

	}

}
