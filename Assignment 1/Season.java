/*
26. Season Based on Month 
Scenario: Print season based on month number: 
● Dec–Feb → Winter 
● Mar–May → Summer 
● Jun–Aug → Monsoon 
● Sep–Nov → Autumn 
Input: 
Enter month number: 12 
Output: 
Season is Winter 
*/
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            case 6:
            case 7:
            case 8:
                season = "Monsoon";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
                break;
        }

        System.out.println("Season is " + season);
        sc.close();
    }
}
