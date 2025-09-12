package example.study;

import java.util.Scanner;

public class ioException {

	public static void main(String[] args) {
		Scanner obj = new Scanner("5");
		System.out.println(""+obj.nextLine());
		System.out.println("Exception Output "+" "+obj.ioException());
		obj.close();

	}

}
