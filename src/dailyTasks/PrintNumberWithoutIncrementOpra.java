package dailyTasks;

import java.util.Scanner;

public class PrintNumberWithoutIncrementOpra {
	
	 static void printNumbers(int i, int num) {
	        if (i <= num) {                // condition check
	            System.out.println(i);     // print current number
	            printNumbers(i + 1, num);  // recursive call instead of loop
	        }
	    }

	public static void main(String[] args) {

		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = obj.nextInt();
		

//		for (int i = num; i >= 0; i--) {   // reverse the order 
//            System.out.println(i);
//        }
		for (int i = 0; i <= num; i = i + 1) {   
            System.out.println(i);
        }
		
		printNumbers(0, num);
		

		obj.close();


	}

}
