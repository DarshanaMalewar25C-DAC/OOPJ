/*
Problem 14: Report Title 
Scenario: A report generation system needs to modify document titles by adding department names and 
updating formatting. 
Task: Use StringBuilder method chaining to efficiently modify report titles. 
Sample Input: 
Original title: Annual Report 
Department Name: CDAC 
Expected Output: 
Annual CDAC Report 
*/

class ReportTitle{
	public static void main(String args[]){
		String originaltext = "Annual Report";
		String deptName = "CDAC";
		
		StringBuilder sb = new StringBuilder(originaltext);
		sb.insert(7,deptName+" ");
		System.out.println(sb);
	}
}
		