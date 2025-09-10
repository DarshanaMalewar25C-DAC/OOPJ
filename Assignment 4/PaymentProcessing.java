/*
Problem 8: Payment Processing 
Scenario: A payment gateway system processes transactions and needs to clean up database connections 
(just a scenario, database knowledge not required) regardless of whether the payment succeeds or fails. 
Task: Create a payment processing method that uses finally block for cleanup operations. 
Sample Input: 
(No input required) 
Expected Output: 
Exception occurred: Payment failed   
Cleanup done 
*/

class PaymentProcessing{
	public static void main(String args[]){
		try{
			throw new Exception("Payment failed");
		}
		catch(Exception e){
			System.out.println("Exception occurred: "+e.getMessage());
		}
		finally{
			System.out.println("Cleanup done");
		}
	}
}