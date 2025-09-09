package DSA.array;

import java.util.Scanner;

public class OodandEvenInArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
			
		}
		
		int evenSum=0;
		int oddSum =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenSum +=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		
		System.out.println("even array Sum : "+evenSum+" , odd array sum : "+oddSum);
		
	

	}

}
