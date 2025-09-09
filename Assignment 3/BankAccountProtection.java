/*1.Bank Account Protection 
Scenario: You are creating a simple banking system. A user should not be able to directly change their 
balance. 
Problem Statement: 
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to 
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance. 
Class/Fields: 
● private double balance 
Methods: 
● deposit(double amount) → add to balance 
● withdraw(double amount) → subtract from balance if sufficient 
● getBalance() → returns current balance 
Sample Input: 
Deposit = 5000 
Withdraw = 2000 
Sample Output: 
Updated Balance = 3000 
*/
 import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public int getBalance() {
        return (int)this.balance; 
    }
}

public class BankAccountProtection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deposit = ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Withdraw = ");
        double withdrawAmount = scanner.nextDouble();

        BankAccount b1 = new BankAccount(0);
        b1.deposit(depositAmount);
        b1.withdraw(withdrawAmount);

      
        System.out.println("Updated Balance = " + b1.getBalance());

        scanner.close();
    }
}
