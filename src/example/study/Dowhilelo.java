package example.study;

import java.util.Scanner;

public class Dowhilelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		 int a = 0;  
		
		do {
			System.out.println("\n ___menu_____");
			System.out.println("1.Say Hello");
			System.out.println("2. Show Date and Time");
			System.out.println("3.Exit");
			System.out.println("Enter the your Choice :");
			a = obj.nextInt();
			if (a==1){
				System.out.println("1.Say Hello");
			}
			else if(a==2) {
				System.out.println("Current time :"+java.time.LocalTime.now());
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
//		}while(a!=3);
		obj.close();

	}

}
