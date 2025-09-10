/*
Problem 2: Exam Scores 
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might 
accidentally try to access the score of a student number that doesn't exist in the class roster. 
 
Task: Create a program that stores exam scores in an array and safely accesses student scores by index. 
 
Sample Input: 
3 
78 90 85 
5 
 
Expected Output:
Invalid index accessed.
*/


class ExamScores{
	public static void main(String args[]){
		int[] score = {78,90,85};
		int index = 5;
		if(index >= 0 && index<score.length){
		     System.out.println("Score: "+ score[index]);
		}
		else{
			System.out.println("Invalid index accessed. ");
		}
	}
}
		
