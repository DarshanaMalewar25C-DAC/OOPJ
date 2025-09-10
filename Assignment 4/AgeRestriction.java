/*
Problem 6: Age Restriction 
Scenario: A professional workshop registration system only allows participants who are 18 years or 
older. The system needs a custom exception for age validation. 
Task: Create a custom exception class and use it to validate user age during registration. 
Sample Input: 
16 
Expected Output: 
AgeNotValidException: Age must be ≥ 18
*/
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

class AgeRestriction {
	public static void main(String args[]){
		int age = 16;
		
		  try {
            register(age);
        } catch (AgeNotValidException e) {
            System.out.println("AgeNotValidException: " + e.getMessage());
        }
    }

   
    public static void register(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be ≥ 18");
        } else {
            System.out.println("Registration successful");
        }
    }
}
	