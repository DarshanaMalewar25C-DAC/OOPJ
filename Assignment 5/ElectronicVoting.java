/*
Problem 10: Electronic Voting System 
Use Case: Track unique voters in an election system to prevent duplicate voting. 
Requirements: 
● Record voter IDs 
● Ensure one vote per voter 
● Count total unique voters 
Sample Input: 
Voter IDs: 201, 202, 203, 202 
Expected Output: 
Total voters: 3 
*/
import java.util.ArrayList;

class ElectronicVoting{
	public static void main(String args[]){
		ArrayList<Integer> voterId = new ArrayList();
		voterId.add(201);
		voterId.add(202);
		voterId.add(203);
		voterId.add(202);
		
		ArrayList<Integer> uniqueVoter = new ArrayList();
		for(int id : voterId)  {
		    if(!uniqueVoter.contains(id)) {
				uniqueVoter.add(id);
			}
		}
		System.out.println("Total voters: "+uniqueVoter.size());
	}
}
		