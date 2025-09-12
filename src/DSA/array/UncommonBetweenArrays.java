package DSA.array;

public class UncommonBetweenArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.print("Uncommon elements: ");
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr1[i] + " ");
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            boolean found = false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[j] + " ");
            }
        }
    }
}
