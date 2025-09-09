/*Problem 14: Bank Name Display 
Scenario: 
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to 
BankAccount. 
● Call displayBankName() from main. 
● Create one account to verify instance creation.
*/
class BankAccount1 {
    String accountHolder;
    double balance;

    // ✅ Static variable
    static String bankName = "CDAC Bank";

    // ✅ Static method to display bank name
    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    BankAccount1(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance for withdrawal of " + amount);
        }
    }

    void displayData() {
        System.out.println("Account Holder: " + getAccountHolder() + ", Balance: " + getBalance());
    }
}

class BankDisplay {
    public static void main(String[] args) {
        // ✅ Call static method to display bank name
        BankAccount1.displayBankName();

        // ✅ Create one account to verify instance creation
        BankAccount1 acc1 = new BankAccount1("Darshana", 25000);
        acc1.displayData();
    }
}
