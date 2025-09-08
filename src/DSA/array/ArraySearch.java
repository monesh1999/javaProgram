package DSA.array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
			
		}
		 System.out.println("Enter the index number of the element you want to access (0 to "+(n-1)+" ) is :");
		 
		int key = obj.nextInt();
		boolean found = false;
		 for(int i = 0 ; i<n ; i++) {
			 if(arr[i]==key) {
				 System.out.println("the element is found :"+i);
				 found =true;
			 }
			 
		 }
		 if(!found) {
			 System.out.println("the element not found");
		 }
		 
		 obj.close();

	}

}
