package DailyTaskOops;

public class BankAccount {
    
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

   
    public double getBalance() {
        return balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

  
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); 

        System.out.println("Final Balance: " + account.getBalance());
    }
}
