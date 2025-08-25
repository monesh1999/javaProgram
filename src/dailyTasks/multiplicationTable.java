package dailyTasks;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		 int a = obj.nextInt(); 
		 
		 for(int i = 1;i<=10;i++) {
			 
			 System.out.println(a+"*"+i+"="+a*i);
		 }
		 obj.close();

	}

}
