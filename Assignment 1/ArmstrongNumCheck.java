/*42. Armstrong Numbers Between 100–500 
Scenario: Print all Armstrong numbers between 100 and 500. Output: 
153 
370 
371 
407 
*/
public class ArmstrongNumCheck {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");
        for (int i = 100; i <= 500; i++) {
            int number = i;
            int originalNumber = number;
            int sumOfCubes = 0;

            while (number > 0) {
                int digit = number % 10; 
                sumOfCubes += digit * digit * digit; 
                number /= 10; 
            }

            if (sumOfCubes == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}

