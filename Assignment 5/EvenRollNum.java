/*Problem 20: Even Roll Number Filter 
Use Case: Filter and display only students with even roll numbers. 
Requirements: 
● Process list of roll numbers 
● Remove odd roll numbers 
● Display filtered results 
Sample Input: 
Roll numbers: 101, 102, 103, 104 
Expected Output: 
Even Roll Numbers: 102, 104 
*/
import java.util.*;

class EvenRollNum{
	public static void main(String args[]){
		
		Set<Integer>rollnum = new LinkedHashSet();
		rollnum.add(101);
		rollnum.add(102);
		rollnum.add(103);
		rollnum.add(104);
		
		List<Integer> evenRolls = new ArrayList<>();

        for (int roll : rollnum) {
            if (roll % 2 == 0) {
                evenRolls.add(roll);
            }
        }

        System.out.print("Even Roll Numbers: ");
        for (int i = 0; i < evenRolls.size(); i++) {
            System.out.print(evenRolls.get(i));
            if (i < evenRolls.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
		
		