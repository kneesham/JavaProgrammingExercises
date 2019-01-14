/***************************************************************

 Name: Theodore Nesham
Date: 1 - 14 - 2019

Description: This is a simple program that will
 determine if a three digit integer will be a palindrome.

***************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int userInput;
        boolean isThreeDigit;

        System.out.println("Please enter a three digit number: ");
        userInput = Math.abs(in.nextInt());

        isThreeDigit = userInput < 1000 && userInput >= 100;

        if (isThreeDigit) {

            int reverse = ((userInput % 10) * 100) + (((userInput / 10) % 10) * 10) + ((userInput / 100) % 10);
            // reversing the number

            if (reverse == userInput) {
                System.out.println("Number is a palindrome reversed is: " + reverse);
            }
            else {
                System.out.println("Number is NOT a palindrome reversed is: " + reverse);
            }
        }
    }
}
