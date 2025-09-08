/*
8. Shop Discount Calculation 
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount 
as input and calculate final cost. 
Input: 
Enter total purchase amount: 1200 
Output: 
Final cost after discount: 1080
*/
import java.util.Scanner;
class ShopDiscount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter total purchase amount: ");
		double amount= sc.nextDouble();
		
		double finalCost;
		if(amount > 1000){
			double discount = amount * 0.10;
			finalCost = amount - discount;
		}
		else{
			finalCost = amount;
		}
		System.out.println("Final cost after discount: "+ finalCost);
		sc.close();
	}
}
			
