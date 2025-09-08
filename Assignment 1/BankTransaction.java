/*
3. Bank Transaction Check 
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a 
deposit (positive) or a withdrawal (negative). 
Input: 
Enter transaction amount: -2500 
Output: 
Withdrawal transaction
*/
import java.util.Scanner;
class BankTransaction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter transaction amount: ");
		double Tamount = sc.nextDouble();
		
		if(Tamount>0){
			System.out.println("Deposite Transaction.");
		}
		else if(Tamount<0){
			System.out.println("Withdrawal transaction.");
		}
		else{
			System.out.println("No change in Account balance.");
		}
		sc.close();
	}
}
			