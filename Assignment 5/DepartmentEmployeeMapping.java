/*
Problem 28: Department Employee Mapping 
Use Case: Organize employees by department for HR management. 
Requirements: 
● Map departments to employee lists 
● Group employees by department 
● Display departmental structure 
Sample Input: 
Department mapping: "IT" → ["Amit", "Rohan"], "HR" → ["Priya"] 
Expected Output: 
Department Structure: IT: Amit, Rohan; HR: Priya 
*/

import java.util.*;

public class DepartmentEmployeeMapping {
    public static void main(String[] args) {
        
        Map<String, List<String>> department = new LinkedHashMap<>();
        department.put("IT", Arrays.asList("Amit", "Rohan"));
        department.put("HR", Arrays.asList("Priya"));

        System.out.print("Department Structure: ");
        int count = 0;
        int size = department.size();

        for (String dept : department.keySet()) {
            List<String> employees = department.get(dept);

            System.out.print(dept + ": ");
            System.out.print(String.join(", ", employees));

            count++;
            if (count < size) {
                System.out.print("; ");
            }
        }
    }
}
