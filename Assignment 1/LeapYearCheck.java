/*6. Leap Year Check for a Birthday 
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input 
and check if it’s a leap year. 
Input: 
Enter year: 2024 
Output: 
2024 is a leap year. 
*/
import java.util.Scanner;
class LeapYearCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int Year = sc.nextInt();
		
		if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
			System.out.println(Year +" is a leap year.");
		}
		else{
			System.out.println(Year +"is not a leap year.");
		}
		sc.close();
	}
}