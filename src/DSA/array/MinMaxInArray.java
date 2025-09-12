package DSA.array;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 87, 3, 45, 99, 23}; // Example array

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
