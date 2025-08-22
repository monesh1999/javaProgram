package dailyTasks;

import java.util.Scanner;

public class checkPrime {
	
	
	
	  static void checkPrime1(int num) {
	        if (num <= 1) {
	            System.out.println(num + " is Not Prime");
	        }
	        if (num == 2 || num == 3 || num == 5 || num == 7) {
	            System.out.println(num + " is Prime");
	        }
	        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
	            if (num != 2 && num != 3 && num != 5 && num != 7) {
	                System.out.println(num + " is Not Prime");
	            }
	        }
	        if (num > 7 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
	            System.out.println(num + " is Prime");
	        }
	    }


	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number :");
		 int num = obj.nextInt();
	     boolean isPrime = true;

	        if (num <= 1) 
	            isPrime = false;

	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime) 
	            System.out.println(num + " is Prime");

	        checkPrime1(num);
	        obj.close();

	}

}
