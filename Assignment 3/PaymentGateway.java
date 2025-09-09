/*
24. Payment Gateway  
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All 
payments must implement a pay() method. 
Problem Statement: 
● Create an interface Payment → method pay(double amount) 
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay() 
implementation 
● In main(), take payment amount and process payment using both methods 
Sample Input: 
CreditCardPayment → amount=2500 
PayPalPayment → amount=1500 
Sample Output: 
Processing Credit Card Payment of 2500 
Processing PayPal Payment of 1500 
*/

interface Payment {
	public void pay(double amount) ;
}
class CreditCardPayment implements Payment{
	@Override
	public void pay(double amount){
		System.out.println("Processing Credit Card Payment of "+amount);
	}
}
class PayPalPayment implements Payment{
	public void pay(double amount){
		System.out.println("Processing PayPal Payment of "+amount);
	}
}	


class PaymentGateway{
	public static void main(String args[]){
		CreditCardPayment c1 = new CreditCardPayment();
		c1.pay(2500);
		
		PayPalPayment p1 = new PayPalPayment();
		p1.pay(1500);
	}
}
		
	
