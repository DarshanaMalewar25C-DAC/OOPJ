/*
Problem 18: Batch Merger System 
Use Case: Merge student lists from morning and evening batches, removing duplicates. 
Requirements: 
● Combine two student lists 
● Remove duplicate students 
● Maintain unique student list 
Sample Input: 
Morning batch: "Amit", "Priya" 
Evening batch: "Rohan", "Priya" 
Expected Output: 
Combined batches: Amit, Priya, Rohan 
*/

import java.util.*;

class BatchMerger{
	public static void main(String args[]){
		String[] morningbatch = {"Amit", "Priya"};
		String[] eveningbatch = {"Rohan", "Priya"};
		
		Set<String> combinedBatch = new LinkedHashSet();
		combinedBatch.addAll(Arrays.asList(morningbatch));
		combinedBatch.addAll(Arrays.asList(eveningbatch));
		
		System.out.println("Combined batches: " + String.join(", ",combinedBatch));
	}
}
		
