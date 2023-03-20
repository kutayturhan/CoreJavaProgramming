/*
Write a Java program that takes a string input from the user, and calculates the sum of all the digits within that string.

For example, if the user enters the string "A1B2C3", the program should output the value 6, which is the sum of the digits 1, 2, and 3 in the input string.

If the character is a digit, you can convert it to an integer using the character's ASCII code. To convert a character to its ASCII code, you can subtract 48 from the character.

After iterating through the entire input string, the program should output the sum of all the digits that were found.
*/

package java_ForLoop;

import java.util.Scanner;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string containing digits: ");
        String str = scan.nextLine();

        int sumOfDigits = 0;
        char charsOfString = '\0';

        for (int i = 0; i < str.length(); i++) {

            charsOfString = str.charAt(i);

            if (charsOfString >= '1' && charsOfString <= '9') {
                sumOfDigits += charsOfString - 48;
            }
        }
        System.out.println("The sum of the digits in the input string is: " + sumOfDigits);
    }
}

//This is a Java program that calculates the sum of all the digits within a string entered by the user.
//The program uses a Scanner object to prompt the user to enter a string containing digits.
//
//The program initializes a variable to keep track of the sum of the digits found in the input string.
//It also initializes a character variable to represent each character in the input string as the loop iterates through it.
//
//The for loop iterates through each character in the input string, one character at a time.
//For each character, the program checks if it is a digit by comparing its ASCII code to the ASCII codes for the characters '1' to '9'.
//If the character is a digit, its integer value is calculated by subtracting the ASCII code for the character '0' from the character's ASCII code.
//The integer value of the digit is added to the sum of the digits found in the input string.
//
//After iterating through the entire input string, the program outputs the sum of all the digits that were found in a formatted message to the console.