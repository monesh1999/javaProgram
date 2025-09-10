package DSA.array;

import java.util.Scanner;

public class arrayNumReplace {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		
		System.out.println("Enter the keyIndex you want to replace");
		int index = obj.nextInt();
		
			if(index < 0 || index >= arr.length) {
	            System.out.println("❌ Invalid index! Please enter between 0 and " + (n-1));
	        } else {
	            System.out.print("Enter the new number: ");
	            int replace = obj.nextInt();
	            
	            // Replace at given index
	            arr[index] = replace;
	            
	            // Print updated array
	            System.out.print("Updated array: ");
	            for(int number : arr) {
	                System.out.print(number + " ");
	            }
	        }
		obj.close();

	}
	

}
