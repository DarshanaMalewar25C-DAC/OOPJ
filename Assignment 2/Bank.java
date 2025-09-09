/*
Problem 12: Bank Account Basic Info 
Scenario: 
Create BankAccount class with accountHolder and balance. 
● Use parameterized constructor to initialize account. 
● Create getter and setter for balance. 
● In main, create one account and display details.
*/
class BankAccount{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder= accountHolder;
		this.balance=balance;
	}
	String getAccountHolder(){
		return accountHolder;
	}
	double getBalance(){
		return balance;
	}
	void setBalance(){
		this.balance=balance;
	}
	void displyData(){
		System.out.println("Account holder: "+ getAccountHolder()+ ", Balance: "+ getBalance());
	}
}

class Bank{
	public static void main(String args[]){
		BankAccount b1= new BankAccount("Vikas Mukharjee", 500000);
		b1.displyData();
		
		BankAccount b2= new BankAccount("Ayra Malewar", 100000);
		b2.displyData();
	}
}