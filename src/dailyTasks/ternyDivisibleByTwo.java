package dailyTasks;

import java.util.Scanner;

public class ternyDivisibleByTwo {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	     System.out.println("Enter a number:");
	     int num = obj.nextInt();

	        
	     String result = (num % 2 == 0) ? "Divisible by 2" : "Not Divisible by 2";

	     System.out.println("Number " + num + " is " + result);

	}

}
