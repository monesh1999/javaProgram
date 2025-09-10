package DSA.array;

import java.util.Scanner;

public class frequencyCount {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			int count = 0;
			boolean alreadycount = false;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					
					alreadycount = true;
					break;
				}
			}
			if(alreadycount)
				continue;
			for(int j = 0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			System.out.println(arr[i]+"---> "+count+ (count>1?" times":" time"));
		}
		obj.close();

	}

}
