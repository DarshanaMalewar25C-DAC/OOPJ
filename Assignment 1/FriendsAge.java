/*
12. Oldest and Youngest Among Three Friends 
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the 
oldest and youngest. 
Input: 
Enter age of Friend 1: 22 
Enter age of Friend 2: 25 
Enter age of Friend 3: 20 
Output: 
Oldest: Friend 2 
Youngest: Friend 3
*/
import java.util.Scanner;
class FriendsAge{ public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age of Friend 1: ");
        int age1 = scanner.nextInt();
        System.out.print("Enter age of Friend 2: ");
        int age2 = scanner.nextInt();
        System.out.print("Enter age of Friend 3: ");
        int age3 = scanner.nextInt();
        int oldestAge;
        int youngestAge;
        String oldestFriend;
        String youngestFriend;

        if (age1 >= age2 && age1 >= age3) {
            oldestAge = age1;
            oldestFriend = "Friend 1";
        } else if (age2 >= age1 && age2 >= age3) {
            oldestAge = age2;
            oldestFriend = "Friend 2";
        } else {
            oldestAge = age3;
            oldestFriend = "Friend 3";
        }
        if (age1 <= age2 && age1 <= age3) {
            youngestAge = age1;
            youngestFriend = "Friend 1";
        } else if (age2 <= age1 && age2 <= age3) {
            youngestAge = age2;
            youngestFriend = "Friend 2";
        } else {
            youngestAge = age3;
            youngestFriend = "Friend 3";
        }

        System.out.println("Oldest: " + oldestFriend);
        System.out.println("Youngest: " + youngestFriend);
        scanner.close();
    }
}