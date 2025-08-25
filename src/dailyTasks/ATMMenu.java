package dailyTasks;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double balance = 1000.0; // Initial balance
        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance: ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ₹");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposited ₹" + deposit + ". New Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid deposit amount!");
                }
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ₹");
                double withdraw = sc.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdrawn ₹" + withdraw + ". New Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid withdrawal! Insufficient balance.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();

	}

}
