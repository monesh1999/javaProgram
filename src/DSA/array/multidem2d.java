package DSA.array;

import java.util.Scanner;

public class multidem2d {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[100][100];
		int row,col,i,j;
		System.out.println("enter the number of row");
		row=obj.nextInt();
		System.out.println("enter the number of col");
		col=obj.nextInt();
		
		for(i =0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.printf("Enter the array element ",i,j);
				a[i][j]=obj.nextInt();
				}
		}
		System.out.println("\nThe 2D array is:");
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        }

	}

}
