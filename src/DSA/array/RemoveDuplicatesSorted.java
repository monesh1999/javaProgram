package DSA.array;

import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 3, 5, 7, 8}; 
        Arrays.sort(arr); // Sort first

        int n = arr.length;
        int[] temp = new int[n];
        int newLength = 0;

        temp[newLength++] = arr[0]; // First element is always unique

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[newLength++] = arr[i];
            }
        }

        int[] uniqueArr = Arrays.copyOf(temp, newLength);
        System.out.println("Array without duplicates (sorted): " + Arrays.toString(uniqueArr));
    }
}
