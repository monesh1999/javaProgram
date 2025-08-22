package dailyTasks;

import java.util.Scanner;

public class StrToNumCon {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number String");
		String numberString = obj.next();
		int intvalue = Integer.parseInt(numberString);
		Long longvalue = Long.parseLong(numberString);
		float floatvalue = Float.parseFloat(numberString);
		double doublevalue = Double.parseDouble(numberString);
		
		System.out.println(intvalue);
		System.out.println(longvalue);
		System.out.println(floatvalue);
		System.out.println(doublevalue);
		
		obj.close();
		
		

	}

}
