package dailyTasks;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int a = obj.nextInt();
		
		if(a <0 || a>100) {
			System.out.println("please Enter the marks between 0 : 100");
		}
		else if(a>=90) {
			System.out.println("Grade is A ");
		}
		else if(a>=80) {
			System.out.println("Grade is B ");
		}
		else if(a>=70) {
			System.out.println("Grade is c ");
		}
		else if(a>=60) {
			System.out.println("Grade is D ");
		}
		else {
			
				System.out.println("Grade is Fail");
			
		}
		obj.close();

	}

}
