/*7. Exam Pass or Fail 
Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed 
(>=35) or failed. 
Input: 
Enter marks: 42 
Output: 
Student has passed. 
*/
import java.util.Scanner;
class ExamResult{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks= sc.nextInt();
		
		if(marks>=35){
			System.out.println("Student has passed.");
		}
		else{
			System.out.println("Student has failed.");
		}
		sc.close();
	}
}