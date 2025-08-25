package dailyTasks;

import java.util.Scanner;

public class HelloMenu {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		 int a = 0;  
		
		do {
			System.out.println("\n ___menu_____");
			System.out.println("1.print Hello");
			System.out.println("2.print world");
			System.out.println("3.Exit");
			System.out.println("Enter the your Choice :");
			a = obj.nextInt();
			if (a==1){
				System.out.println(" Hello");
			}
			else if(a==2) {
				System.out.println("World");
			}
			else if(a==3) {
				System.out.println("are u want to exit");
				char confirm = obj.next().charAt(0);
				if(confirm =='Y'|| confirm =='y') {
					System.out.println("GOOD BYE");
					break;
				}
				else {
					System.out.println("continuing the program");
				}
				
			}
			else {
				System.out.println("invalid");
			}
			
		}while(true);
		
		obj.close();

	}

}
