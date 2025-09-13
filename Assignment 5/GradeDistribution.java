/*
Problem 17: Grade Distribution Counter 
Use Case: Analyze the distribution of grades in a class. 
Requirements: 
● Count frequency of each grade 
● Display grade distribution 
● Handle multiple occurrences 
Sample Input: 
Grades: ["A", "B", "A", "C", "B", "A"] 
Expected Output: 
Grade Distribution: A=3, B=2, C=1 
*/


	import java.util.ArrayList;

class GradeDistribution{
	public static void main(String args[]){
        ArrayList<String> grades = new ArrayList<>();
        grades.add("A");
        grades.add("B");
        grades.add("A");
        grades.add("C");
        grades.add("B");
        grades.add("A");

        ArrayList<String> uniqueGrades = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (String g : grades) {
            if (uniqueGrades.contains(g)) {
                int i = uniqueGrades.indexOf(g);
                counts.set(i, counts.get(i) + 1);
            } else {
                uniqueGrades.add(g);
                counts.add(1);
            }
        }

        System.out.print("Grade Distribution: ");
        for (int i = 0; i < uniqueGrades.size(); i++) {
            System.out.print(uniqueGrades.get(i) + "=" + counts.get(i));
            if (i != uniqueGrades.size() - 1) System.out.print(", ");
        }
    }
}
	