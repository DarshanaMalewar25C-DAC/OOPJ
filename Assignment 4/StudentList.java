/*
Problem 7: Student List 
Scenario: A school management system tries to load a student list from a file at the beginning of each 
semester. Sometimes the file might not exist or be corrupted. 
Task: Simulate file reading operation and handle FileNotFoundException. 
Sample Input: 
student_list.txt 
Expected Output: 
File not found
*/

import java.util.*;
import java.io.*;
import java.util.Scanner;

class StudentList {
	public static void main(String args[]){
		String filename="student_list.txt";
		try{
			File f = new File(filename);
			Scanner sc=new Scanner(f);
			
			while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
			