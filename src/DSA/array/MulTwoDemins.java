package DSA.array;

public class MulTwoDemins {
    public static void main(String[] args) {
        int a[][] = {
            {1, 4, 3},
            {1, 2, 1}
        }; // 2 × 3

        int b[][] = {
            {3, 4},
            {4, 3},
            {2, 1}
        }; // 3 × 2

        int r1 = 2, c1 = 3; 
        int r2 = 3, c2 = 2;  

        int c[][] = new int[r1][c2]; 

        for (int i = 0; i < r1; i++) {         
            for (int j = 0; j < c2; j++) {     
                for (int k = 0; k < c1; k++) { 
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int[] row : c) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
