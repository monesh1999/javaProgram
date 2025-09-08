package DSA.array;

import java.util.Scanner;

public class arrayImple {
	
	static double avg(int sum , int n) {
		return (double)sum/n;
	}

	public static void main(String[] args) {
		//array is data structure container object that holds a fix number of values of a single type 
		//note array are 0 index
		//you must declare the array 
		//size is fixed once created
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		
		int sum = 0;
		 for(int i =0;i<n;i++) {
			 System.out.println("output the number :");
			 System.out.println(arr[i]);
			 sum = sum+ arr[i];
			 
		 }
		 
		 System.out.println("sum of the array is : "+sum);
		
		 System.out.println("Average of the array is : "+avg(sum,n));
		 
		
		
		 obj.close();
		

	}

}
