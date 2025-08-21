package dailyTasks;

import java.util.Scanner;

public class CheckOddOrEven {
	
	static String oddorEven(int x) {
		if (x % 2 == 0) {
			return x+" is Even number";
		}
		else {
		return x+" is odd number";
		}
		
	}

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = obj.nextInt();
		
		if (number % 2 == 0) {
			System.out.println(number+" is Even number");
		}
		if (number % 2 != 0) {
			System.out.println(number+" is odd number");
		}
		
		System.out.println(oddorEven(number));
		
		obj.close();

	}

}
