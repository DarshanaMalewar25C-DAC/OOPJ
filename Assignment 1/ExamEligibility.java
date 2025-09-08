/*
13. Exam Eligibility with Medical Cause 
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and 
medical cause (Y/N) as input and decide if the student can sit in exam. 
Input: 
Classes held: 100 
Classes attended: 60 
Medical cause (Y/N): Y 
Output: 
Student is allowed to sit for the exam. 
*/ 
import java.util.Scanner; // Import the Scanner class to read user input.

class ExamEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total classes held: ");
        int totalClasses = scanner.nextInt();
        System.out.print("Enter classes attended: ");
        int attendedClasses = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Medical cause (Y/N): ");
        char medicalCause = scanner.next().charAt(0);

        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        if (attendancePercentage >= 75 || (medicalCause == 'Y' || medicalCause == 'y')) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }
        scanner.close();
    }
}
