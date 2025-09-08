package DSA.array;

import java.util.Scanner;

public class arrayIndex {
	
	
	public static void main(String[] agrs) {
		
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		
		System.out.println("Enter the number :");
		for(int i =0;i<n;i++) {
			arr[i] = obj.nextInt();
			
		}
        System.out.println("Enter the index number of the element you want to access (0 to "+(n-1)+" ) is :");
		 
		 int index = obj.nextInt();
		 if(index>=0& index <n) {
			 System.out.println("Element at index "+index+" is "+arr[index]);
		 }
		 else {
			 System.out.println("invalid index!");
		 }
		 
		
		 obj.close();
	}
		

}

