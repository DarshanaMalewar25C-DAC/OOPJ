/*Problem 13: Bank Deposit & Withdrawal 
Scenario: 
Extend previous problem. Add methods: 
● deposit(double amount) → adds to balance 
● withdraw(double amount) → subtracts from balance 
● Create two accounts, perform deposit/withdraw, display updated balance.
*/
class BankAccount1{
	String accountHolder;
	double balance;
	
	BankAccount1(String accountHolder, double balance){
		this.accountHolder= accountHolder;
		this.balance=balance;
	}
	String getAccountHolder(){
		return accountHolder;
	}
	double getBalance(){
		return balance;
	}
	void setBalance() {
		this.balance=balance;
	}
	
	void deposit(double amount) { 
		if(amount > 0){
			balance+= amount;
			System.out.println("Deposited: "+amount);
		}
		else
		{
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	void  withdraw(double amount){
		if (amount > 0 && balance >= amount) {
		balance -= amount ;
		System.out.println("Withdraw: "+amount);
	}
	else if(amount<=0){
		System.out.println("Withdrawal amount must be positive.");
	}
	else{
		System.out.println("Insufficient balance gor withdrawal of "+amount);
	}
	}
	void displyData(){
		System.out.println("Account holder: "+ getAccountHolder()+ ", Balance: "+ getBalance());
	}
}

class Bank1{
	public static void main(String args[]){
		BankAccount1 b1 = new BankAccount1("Vikas Mukharjee", 500000);
		BankAccount1 b2 = new BankAccount1("Ayra Malewar", 100000);
		System.out.println("--- nitial Account Data ---");
		b1.displyData();
		b2.displyData();
		System.out.println();
		
		System.out.println("--- Performing Transactions ---");
        b1.deposit(50000); // Deposit into b1
        b1.withdraw(20000); // Withdraw from b2
        b2.withdraw(5000); // Withdraw from b1
        b2.deposit(10000); // Deposit into b2
        System.out.println();
		
		System.out.println("--- Updated Account Data ---");
        b1.displyData();
        b2.displyData();
	}
}

	