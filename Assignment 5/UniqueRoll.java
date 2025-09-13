/*Problem 6: Unique Roll Number Validator 
Use Case: A registration system must ensure no duplicate roll numbers are assigned. 
Requirements: 
● Accept roll numbers for registration 
● Automatically remove duplicates 
● Display unique roll numbers 
Sample Input: 
Roll numbers: 101, 102, 101, 103 
Expected Output: 
Unique Roll Numbers: 101, 102, 103
*/
import java.util.ArrayList;

class UniqueRoll {
    public static void main(String args[]) {
        ArrayList<Integer> roll = new ArrayList<>();
        roll.add(101);
        roll.add(102);
        roll.add(101);
        roll.add(103);

        ArrayList<Integer> unique = new ArrayList<>();


        for (int r : roll) {
            if (!unique.contains(r)) {
                unique.add(r);
            }
        }
        System.out.print("Unique Roll Numbers: ");
        for (int i = 0; i < unique.size(); i++) {
            System.out.print(unique.get(i));
            if (i < unique.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
	
		
		
		
		
