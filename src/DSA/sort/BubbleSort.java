package DSA.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
       
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
    
        for (int i = 0; i < size - 1; i++) {        
            for (int j = 0; j < size - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
       
        System.out.println("Sorted Array (Ascending):");
        for (int val : arr) {
            System.out.print(val + " ");
        }

	}

}
