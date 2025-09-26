package patternProgram;

public class RightHalfPyramid {

	public static void main(String[] args) {
		int i, j,n=5;

        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
	}

}
