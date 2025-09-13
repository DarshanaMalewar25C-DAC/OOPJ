/*
Problem 8: Course Registration System 
Use Case: A student registers for courses, ensuring no duplicate course codes. 
Requirements: 
● Register for courses using course codes 
● Prevent duplicate registrations 
● Display registered courses 
Sample Input: 
Course codes: "CS101", "MA101", "CS101" 
Expected Output: 
Registered Courses: CS101, MA101 
*/
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class CourseRegistration{
	public static void main(String args[]){
		ArrayList<String> codes = new ArrayList();
		codes.add("CS101");
		codes.add("MA101");
		codes.add("CS101");
		
		ArrayList<String> registered = new ArrayList();
		for (String c : codes) {
			if(!registered.contains(c)) {
				registered.add(c);
			}
		}
		System.out.print("Registered Courses: ");
        for (int i = 0; i < registered.size(); i++) {
            System.out.print(registered.get(i));
            if (i != registered.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
