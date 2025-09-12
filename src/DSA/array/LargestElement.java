package DSA.array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 98, 45, 67}; 

        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println("Largest element is " + max);
    }
}
