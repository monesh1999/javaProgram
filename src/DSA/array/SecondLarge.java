package DSA.array;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		
		if(arr.length<2) {
			System.out.println("array must contain atleast two element");
			
		}
		
		int lar = Integer.MIN_VALUE;
		int secLar= Integer.MIN_VALUE;
		
		for(int num :arr) {
			if(num>lar) {
				secLar=lar;
				lar=num;
			}else if(num> secLar && num < lar) {
				secLar=num;
			}
		}
		if(secLar==Integer.MIN_VALUE) {
			System.out.println("no second element");
		}else {
			System.out.println("second large elements :"+secLar);
		}
		

	}

}
