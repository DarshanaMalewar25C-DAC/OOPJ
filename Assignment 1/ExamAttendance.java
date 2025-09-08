/*
10. Exam Attendance Eligibility 
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as 
input, print allowance. 
Input: 
Enter total classes held: 100 
Enter classes attended: 78 
Output: 
Student is allowed to sit for the exam. 
*/
import java.util.Scanner;
class ExamAttendance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total classes held: ");
		int totalclasses = sc.nextInt();
		
		System.out.print("Enter classes attended: ");
		int attendedclasses = sc.nextInt();
		
		double attendancePercentage = ((double) attendedclasses / totalclasses) * 100;
		
		if(attendancePercentage >= 75){
			 System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }
		sc.close();
	}
}

			
