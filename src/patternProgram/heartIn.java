package patternProgram;

public class heartIn {

	public static void main(String[] args) {
		int n= 4;
		
		for (int i = n / 2; i <= n; i += 2) {
            // left spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
