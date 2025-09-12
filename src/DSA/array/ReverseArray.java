package DSA.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array

        int start = 0;
        int end = arr.length - 1;

        // Swap elements until start crosses end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
        }
}