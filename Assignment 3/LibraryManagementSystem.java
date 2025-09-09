/*
30. Library Management System 
Scenario: Manage books and library members with borrowing functionality. 
Problem Statement: 
● Class Book → private variables: bookId, title, author (Encapsulation) 
● Abstract Class LibraryMember → instance variables: memberId, name 
○ Abstract method borrowBook(Book book) 
● Class StudentMember extends LibraryMember → limit 3 books 
● Class FacultyMember extends LibraryMember → limit 5 books 
● Interface Notifyable → method sendNotification(String message) → notify members about 
overdue books 
● In main(), create 1 student and 1 faculty, borrow books, send notifications 
Sample Input: 
Student → borrow 2 books 
Faculty → borrow 4 books 
Sample Output: 
StudentMember Amit borrowed 2 books 
FacultyMember Prof. Singh borrowed 4 books 
Notification sent to Amit: Return books within 7 days 
Notification sent to Prof. Singh: Return books within 14 days 
*/

interface Notifyable{
	void sendNotification(String message);
}

abstract class LibraryMember implements Notifyable{   // Abstract class
	protected static int memberId =0;
	protected String name;
	protected int borrowedCount=0;
	
	LibraryMember(String name){
		this.name=name;
	}
	public abstract void borrowBook(Book book);
	public int getBooksBorrowed() {
        return borrowedCount;
    }
}

class Book {
	private int bookId;
	private String title;
	private String author;
	
	Book(int bookId,String title,String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	public int getBookId(){
		return bookId;
	}
	public String getTitle(){
		return title;
	}
	public String author(){
		return author;
	}
}

class StudentMember extends LibraryMember {
	private  int LIMIT = 3;
	StudentMember(String name){
		super(name);
	}
	@Override
	public void borrowBook(Book book){
		if(borrowedCount<LIMIT){
			borrowedCount++;
		}
		else{
			System.out.println(name+" can't borrow more than 3 books.");
		}
	}
	@Override
	public void sendNotification(String message){
		System.out.println("Notification sent to " + name+ " : " +message);
	}
}

class FacultyMember extends LibraryMember{
	private int LIMIT = 5;
	FacultyMember(String name){
		super(name);
	}
	@Override
	public void borrowBook(Book book){
		if(borrowedCount<LIMIT){
			borrowedCount++;
			}
			else{
				System.out.println(name+", can't borrow more than 5 books.");
			}
	}
	@Override
	public void sendNotification(String message){
		System.out.println("Notification sent to " + name+ " : " +message);
	}
}


class LibraryManagementSystem{
	public static void main(String args[]){
		StudentMember s1= new StudentMember("Amit");
		FacultyMember f1 = new FacultyMember("Prof. Singh");
		
		System.out.println("StudentMember " + s1.name + "  borrowed 2 books");
		System.out.println("FacultyMemberMember " + f1.name + " borrowed 4 books");
		
		s1.sendNotification("Return books within 7 days");
		f1.sendNotification("Return books within 14 days");
	}
}
	
