package DSA.array;

public class SumOddEvenArray {
    public static void main(String[] args) {
        int[] arr = new int[50];

        
        for (int i = 0; i < 50; i++) {
            arr[i] = i + 1;
        }

        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }

        System.out.println("Sum of Even numbers = " + sumEven);
        System.out.println("Sum of Odd numbers  = " + sumOdd);
    }
}
