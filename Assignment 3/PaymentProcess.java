/*
18. Payment Process  
Scenario: Company wants to process payments differently depending on mode of payment, but handle all 
payments through a single reference. 
Problem Statement: 
Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment 
implement pay(). 
Usage: 
● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...) 
● Call p.pay() for runtime polymorphic behavior 
Sample Input: 
Credit Card → cardNumber=1234567890123456, amount=5000 
UPI → upiId=rahul@upi, amount=2000 
Sample Output: 
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid 
Payment via UPI rahul@upi → Rs. 2000 Paid 
*/

abstract class Payment{
	double amount;
	 Payment(double amount) {
        this.amount = amount;
    }
	abstract void pay();
}

class CreditCardPayment extends Payment{
	String cardNumber;
	
	CreditCardPayment( String cardNumber, double amount){
		super(amount);
		this.cardNumber=cardNumber;
	}
	@Override
	public void pay(){
	System.out.println("Payment via Credit Card " + cardNumber + " -> Rs. " + amount + " Paid");
	}
}
class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment(String upiId ,double amount){
		super(amount);
		this.upiId=upiId;
	}
	@Override
	public void pay(){
	System.out.println("Payment via UPI" + upiId + " -> Rs. " + amount + " Paid");
	}
}	
	
class PaymentProcess{
	public static void main(String args[]){
		Payment p;
		p = new CreditCardPayment("1234567890123456",5000);
		p.pay();
		
		p = new UPIPayment("rahul@up", 2000);
		p.pay();
	}
}
		