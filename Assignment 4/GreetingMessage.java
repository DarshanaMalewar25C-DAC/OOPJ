/*
Problem 10: Greeting Message 
Scenario: A learning management system generates personalized greeting messages for students. The 
system starts with a basic greeting and adds course-specific information. 
Task: Use StringBuilder to create a personalized greeting message. 
Sample Input: 
Initial Text: Hello 
Text to insert: CDAC  
Insert Index: 6 
Text to append: Java Student 
Expected Output: 
Hello CDAC Java Student
*/
class GreetingMessage{
	public static void main(String args[]){
		StringBuilder sb =  new StringBuilder("Hello");
		sb.insert(5," CDAC");
		sb.append(" Java Student");
		System.out.println(sb);
	}
}
		