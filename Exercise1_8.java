import java.util.Scanner;

/**
 * BIT235 Workshop 2 - Exercise 1.8
 * Compare two strings that the user enters, and also compare their first characters.
 */
public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        boolean sameText = firstString.equals(secondString);
        System.out.println("Are the two given strings equal? " + sameText);

        boolean sameFirstCharacter = firstString.charAt(0) == secondString.charAt(0);
        System.out.println("First character of the first string : " + firstString.charAt(0));
        System.out.println("First character of the second string: " + secondString.charAt(0));
        System.out.println("Are the first characters equal? " + sameFirstCharacter);

        input.close();
    }
}