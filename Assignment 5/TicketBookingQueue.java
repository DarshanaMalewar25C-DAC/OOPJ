/*
Problem 22: Ticket Booking Queue 
Use Case: Manage customer service in a ticket booking system. 
Requirements: 
● Queue customers for service 
● Serve customers in FIFO order 
● Display current queue status 
Sample Input: 
Queue: "Amit", "Priya", "Rohan" 
Serve: 1 customer 
Expected Output: 
Serving: Amit, Queue: Priya, Rohan
*/
import java.util.*;

class TicketBookingQueue{
	public static void main(String args[]){
		
		Queue<String> queue = new LinkedList();
		queue.add("Amit");
        queue.add("Priya");
        queue.add("Rohan");
		
		String served = queue.poll();
		System.out.print("Serving: "+served + ", Queue: ");
		System.out.println(String.join(", ",queue));
	}
}