/*
18. Day of the Week 
Scenario: Take day number (1–7) and print the day name. 
Input: 
Enter day number: 4 
Output: 
Day is Thursday 
*/
import java.util.Scanner;
class DayOfWeek{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number: ");
		int num = sc.nextInt();
		
		System.out.print("Day is ");
		
		switch(num){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thurday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Invalid day number");
		}
		sc.close();
	}
}
		