package patternProgram;

public class Butterfly {

	public static void main(String[] args) {
		int n =6;
		 for(int i =0;i<n;i++) {
			 for(int j =0;j<=i;j++) {
				 System.out.print("*");
			 }
			 for(int j =0;j<=2*(n-i);j++) {
				 System.out.print(" ");
			 }
			 for(int j =0;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 for(int i =n;i>0;i--) {
			 for(int j =0;j<=i;j++) {
				 System.out.print("*");
			 }
			 for(int j =0;j<=2*(n-i);j++) {
				 System.out.print(" ");
			 }
			 for(int j =0;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 for(int i =0;i<n;i++) {
			 for(int j =0;j<=i;j++) {
				 System.out.print(" ");
			 }
			 for(int j =0;j<=2*(n-i);j++) {
				 System.out.print("*");
			 }
			 for(int j =0;j<=i;j++) {
				 System.out.print(" ");
			 }
			 System.out.println("");
		 }
		 for(int i =n;i>0;i--) {
			 for(int j =0;j<=i;j++) {
				 System.out.print(" ");
			 }
			 for(int j =0;j<=2*(n-i);j++) {
				 System.out.print("*");
			 }
			 for(int j =0;j<=i;j++) {
				 System.out.print(" ");
			 }
			 System.out.println("");
		 }

	}

}
