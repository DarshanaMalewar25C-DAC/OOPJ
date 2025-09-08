/*
4. Even or Odd Locker Number 
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is 
even or odd. 
Input: 
Enter locker number: 17 
Output: 
Odd locker number 
*/
import java.util.Scanner;
class EvenOddLockerNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter locker number: ");
		int Lockernumber = sc.nextInt();
		
		if(Lockernumber%2==0){
			System.out.println("Even locker number");
		}
		else{
			System.out.println("Odd locker number");
		}
		sc.close();
	}
}
	
