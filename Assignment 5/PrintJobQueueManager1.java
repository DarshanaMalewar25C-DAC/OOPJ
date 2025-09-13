/*
Problem 24: Print Job Queue Manager 
Use Case: Manage print jobs in a shared printer system. 
Requirements: 
● Queue print jobs 
● Process jobs in order 
● Display job status 
Sample Input: 
Jobs: "Doc1", "Doc2", "Doc3" 
Process: 1 job 
Expected Output: 
Printing Doc1, Queue: Doc2, Doc3
*/

import java.util.*;

class PrintJobQueueManager1 {
	public static void main(String args[]){
		Queue<String> printqueue = new LinkedList();
		printqueue.add("Doc1");
        printqueue.add("Doc2");
        printqueue.add("Doc3");
		
		String currentJob = printqueue.poll();
		System.out.print("Printing " + currentJob + ", Queue:");
		System.out.println(String.join(", ",printqueue));
	}
}