
/*
Problem 2: Lab Access Queue System 
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served 
system. 
Requirements: 
● Students join the queue for lab access 
● Process students in FIFO order 
● Display remaining queue 
Sample Input: 
Enqueue: "Amit", "Priya", "Rohan" 
Dequeue: 1 student 
Expected Output: 
Queue: Priya, Rohan 
*/

import java.util.LinkedList;
import java.util.Queue;

public class StudentsQueue{
	public static void main(String args[]){
		Queue<String> lq = new LinkedList();
		
		lq.add("Amit");
		lq.add("Priya");
		lq.add("Rohan");
		//System.out.println(lq);
		
		lq.poll();//dequeue
		
		System.out.println("Queue: "+ lq);
	}
}
		
		