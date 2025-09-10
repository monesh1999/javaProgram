package DSA.array;

public class addTwoDeminsion {

	public static void main(String[] args) {
		int a[][] = {{4,5,6},{7,5,6},{2,8,1}};
		int b[][] = {{1,5,8},{3,7,4},{9,3,7}};
		
		int c[][]=new int[3][3];
		
		System.out.println("add of two array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sub of two array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}
