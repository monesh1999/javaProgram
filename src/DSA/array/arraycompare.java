package DSA.array;

import java.util.Scanner;


public class arraycompare {
	
	public static int[] sort(int[] arr) {
	    int n = arr.length;  
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	    return arr; 
	}
	public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

	

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		System.out.println("Enter the number of element");
		int n1 = obj.nextInt();
		int[] arr1 = new int[n1];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n1;i++) {
			arr1[i] = obj.nextInt();
		}
		
		arr = sort(arr);
        arr1 = sort(arr1);

		
		
		if(areArraysEqual(arr,arr1)) {
			System.out.println("array is equal");
		}else {
			System.out.println("Arrays are NOT equal");
				}
			
		
		}
		

	

}
