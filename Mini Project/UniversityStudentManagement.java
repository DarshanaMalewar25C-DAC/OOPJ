/*
University Student Management System 
Placement Pakka Problem Statement: 
Create a University Student Management System using Java Collections to manage students across 
departments. 
● Roll Number (int) 
● Name (String) 
● Department (String) 
● CGPA (double) 
Requirements 
1. Registration List - ArrayList<Student> 
● Store students in registration order 
2. Merit List - Comparable<Student> 
● Sort by CGPA (descending order) 
3. Alphabetical List - Comparator<Student> 
● Sort by name (A to Z) 
4. Department Grouping - HashMap<String, List<Student>> 
● Group students by department 
5. Unique Names - HashSet<String> 
● Track unique student names 
6. Roll Number Sorting - TreeSet<Student> 
● Auto-sort by roll number 
7. Performance Filter - Iterator 
● Remove students with CGPA < 5.0  
8. Recent Registrations - Stack<Student> 
● Track last added students (LIFO) 
9. Scholarship Queue - Queue<Student> 
● Process students for scholarships (FIFO) 
10. Hostel Applications - LinkedList<Integer> 
● Add priority applicants at front 
● Add regular applicants at end 
● Remove from both ends for allocation 

Sample Data 
Student s1 = new Student(101, "Amit", "CS", 8.5); 
Student s2 = new Student(102, "Priya", "Math", 9.2); 
Student s3 = new Student(103, "Rohan", "CS", 7.8); 
Student s4 = new Student(104, "Sneha", "Physics", 4.5); 


Expected Outputs 
Registration Order: Amit, Priya, Rohan, Sneha 
Merit List: Priya(9.2), Amit(8.5), Rohan(7.8), Sneha(4.5) 
Alphabetical: Amit, Priya, Rohan, Sneha 
Department Groups: 
CS: [Amit, Rohan] 
Math: [Priya] 
Physics: [Sneha] 
After Filter (CGPA >= 5.0): Amit, Priya, Rohan 
Hostel Queue: 
Add regular(105): [105] 
Add priority(101): [101, 105]  
Remove front: [105] 
*/

import java.util.*;

// Student class
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    String dept;
    double cgpa;

    Student(int rollNo, String name, String dept, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.cgpa, this.cgpa); // Descending CGPA
    }

    @Override
    public String toString() {
        return name + "(" + cgpa + ")";
    }

    // Comparator for roll number sorting
    static Comparator<Student> RollComparator = Comparator.comparingInt(s -> s.rollNo);
}

// Comparator for alphabetical sorting
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {

        // Sample Data
        Student s1 = new Student(101, "Amit", "CS", 8.5);
        Student s2 = new Student(102, "Priya", "Math", 9.2);
        Student s3 = new Student(103, "Rohan", "CS", 7.8);
        Student s4 = new Student(104, "Sneha", "Physics", 4.5);

        // 1. Registration list
        List<Student> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
        System.out.print("Registration Order: ");
        for (Student s : sList) {
            System.out.print(s.name + " ");
        }
        System.out.println("\n");

        // 2. Merit list
        List<Student> meritList = new ArrayList<>(sList);
        Collections.sort(meritList);
        System.out.print("Merit List: ");
        for (Student s : meritList) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 3. Alphabetical list
        List<Student> alphaList = new ArrayList<>(sList);
        alphaList.sort(new NameComparator());
        System.out.print("Alphabetical Order: ");
        for (Student s : alphaList) {
            System.out.print(s.name + " ");
        }
        System.out.println("\n");

        // 4. Group by Department
        Map<String, List<Student>> deptMap = new HashMap<>();
        for (Student s : sList) {
            deptMap.computeIfAbsent(s.dept, k -> new ArrayList<>()).add(s);
        }

        System.out.println("Department Groups:");
        for (Map.Entry<String, List<Student>> entry : deptMap.entrySet()) {
            System.out.print(entry.getKey() + ": [");
            for (Student s : entry.getValue()) {
                System.out.print(s.name + " ");
            }
            System.out.println("]");
        }
        System.out.println();

        // 5. Unique Names
        HashSet<String> nameSet = new HashSet<>();
        for (Student s : sList) {
            nameSet.add(s.name);
        }
        System.out.println("Unique Names: " + nameSet + "\n");

        // 6. Roll number sorting using TreeSet
        TreeSet<Student> rollSet = new TreeSet<>(Student.RollComparator);
        rollSet.addAll(sList);
        System.out.print("Roll Number Sorted: ");
        for (Student s : rollSet) {
            System.out.print(s.name + "(" + s.rollNo + ") ");
        }
        System.out.println("\n");

        // 7. CGPA >= 5.0 filter
        List<Student> filterList = new ArrayList<>(sList);
        Iterator<Student> itr = filterList.iterator();
        while (itr.hasNext()) {
            if (itr.next().cgpa < 5.0) {
                itr.remove();
            }
        }
        System.out.print("After CGPA Filter (>=5.0): ");
        for (Student s : filterList) {
            System.out.print(s.name + " ");
        }
        System.out.println("\n");

        // 8. Recent Registrations (LIFO - Stack)
        Stack<Student> registrationStack = new Stack<>();
        registrationStack.push(s1);
        registrationStack.push(s2);
        registrationStack.push(s3);
        registrationStack.push(s4);

        System.out.print("Recent Registrations (LIFO): ");
        while (!registrationStack.isEmpty()) {
            System.out.print(registrationStack.pop().name + " ");
        }
        System.out.println("\n");

        // 9. Scholarship Queue (FIFO)
        Queue<Student> scholarship = new LinkedList<>();
        scholarship.offer(s1);
        scholarship.offer(s2);
        scholarship.offer(s3);
        scholarship.offer(s4);
        System.out.print("Scholarship Queue (FIFO): ");
        while (!scholarship.isEmpty()) {
            System.out.print(scholarship.poll().name + " ");
        }
        System.out.println("\n");

        // 10. Hostel Applications - LinkedList<Integer>
        LinkedList<Integer> hostel = new LinkedList<>();
        hostel.addLast(105); // Regular
        System.out.println("Add regular(105): " + hostel);

        hostel.addFirst(101); // Priority
        System.out.println("Add priority(101): " + hostel);

        hostel.removeFirst(); // Remove from front
        System.out.println("Remove front: " + hostel);
    }
}

