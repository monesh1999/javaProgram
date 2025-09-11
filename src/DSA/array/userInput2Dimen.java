package DSA.array;

import java.util.Scanner;

public class userInput2Dimen {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int size = obj.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

       
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element First Array: ");
            arr1[i] = obj.nextInt();
        }

        
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element Second Array: ");
            arr2[i] = obj.nextInt();
        }

        // Output
        System.out.println("__Output__");
        System.out.print("First Array: ");
        for (int val : arr1) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Second Array: ");
        for (int val : arr2) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
