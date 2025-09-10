/*
Problem 25: Payment Processing 
Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to 
convert them to integers for financial calculations. 
Task: Parse string input to integer and perform calculations. 
Sample Input: 
Amount as string: 1000 
Additional amount to add: 500 
Expected Output: 
1000 + 500 = 1500 
*/

class Payment {
	public static void main(String args[]){
		String amountString = "1000";
		int additionalAmount = 500;
		int amount = Integer.parseInt(amountString);
		int result = amount + additionalAmount;
		 
		 System.out.println(amount + " + "+ additionalAmount + " = "+result);
	}
}
		