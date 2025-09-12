package DSA.array;

import java.util.Scanner;

public class ArrayIndexElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        Scanner sc = new Scanner(System.in);

        // 1. Print element based on index
        System.out.print("Enter index (0 - " + (arr.length - 1) + "): ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " = " + arr[index]);
        } else {
            System.out.println("Invalid index!");
        }

        // 2. Print index based on element
        System.out.print("Enter element to find its index: ");
        int element = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                found = true;
                break; // stop after first match
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }

        sc.close();
    }
}
