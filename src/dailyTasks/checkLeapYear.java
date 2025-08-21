package dailyTasks;

import java.util.Scanner;

public class checkLeapYear {
	
	static String checkYear(int x) {
	    if (x % 4 == 0) {
	        if (x % 100 == 0) {
	            if (x % 400 == 0) {
	                return x + " is a leap year";
	            } else {
	                return x + " is a normal year";
	            }
	        } else {
	            return x + " is a leap year";
	        }
	    } else {
	        return x + " is a normal year";
	    }
	}


	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int year = obj.nextInt();
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year+" is Leap year");
		}
		
		System.out.println(checkYear(year));
		obj.close();

	}

}
