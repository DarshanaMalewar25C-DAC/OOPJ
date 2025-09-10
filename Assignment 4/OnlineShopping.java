/*
Problem 5: Online Shopping 
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price). 
The system needs to handle invalid quantities and accessing non-existent products. 
 
Task: Create an order processing method that handles multiple exception types. 
 
Sample Input: 
0 
3 
299.99 499.99 199.99 
5 
 
Expected Output: 
Arithmetic Exception caught 
or 
Array Index Exception*/

class OnlineShopping {
	public static void main(String args[]){
		int quantity = 0;
		double[] price = {299.99,499.99,199.99};
		int index=5;
		try{
		     if(quantity==0){
			 }

            double unitPrice = prices[index];  // throw ArrayIndexOutOfBoundsException
            double total = quantity * unitPrice;
            System.out.println("Total Price: " + total);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }
    }
}