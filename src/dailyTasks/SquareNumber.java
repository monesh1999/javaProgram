package dailyTasks;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		 int a = 0;  
		
		do {
			System.out.println("Enter a number if negative number it will stop");
			a = obj.nextInt();
			if(a>=0) {
				System.out.println("Square of "+a+" is "+(a*a));
				
			}
		}while(a>=0);
		
			obj.close();

	}

}
