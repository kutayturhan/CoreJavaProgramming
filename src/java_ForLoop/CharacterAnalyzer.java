/*
Write a Java program that accepts a string input from the user, and then retrieves and prints out the separate groups of characters from the input string.
The program should output three separate groups: letters, digits, and special characters.

For example, if the user inputs the string "mn@#123Ab!", the program should output:
Letters in the char sequence are: mnAb
Digits in the char sequence are: 123
Special Chars in the char sequence are: @#!
*/

package java_ForLoop;

import java.util.Scanner;

public class CharacterAnalyzer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the char sequence you want to analyze: ");
        String charSequence = scan.nextLine();

        String letters = "";
        String digits = "";
        String specialChars = "";

        if (charSequence.contains(" ")){
            charSequence.replaceAll(" ", "");
        }

        for (int i = 0; i < charSequence.length(); i++) {

            char charsInSequence = charSequence.charAt(i);

            if ((charsInSequence >= 'a' && charsInSequence <= 'z') || (charsInSequence >= 'A' && charsInSequence <= 'Z')) {
                letters += charsInSequence;
            } else if (charsInSequence >= '0' && charsInSequence <= '9') {
                digits += charsInSequence;
            } else {
                specialChars += charsInSequence;
            }
        }

        System.out.println("Letters in the char sequence are: " + letters);
        System.out.println("Digits in the char sequence are: " + digits);
        System.out.println("Special Chars in the char sequence are: " + specialChars);

    }
}

//The Java program accepts a string input from the user and retrieves the separate groups of characters from the input string, which include letters, digits, and special characters.
//
//The program first prompts the user to enter the character sequence to be analyzed using the Scanner class.
//Then, it initializes three empty strings, namely letters, digits, and specialChars, which will be used to store the separate groups of characters.
//
//Next, the program checks if the character sequence contains any spaces and removes them using the replaceAll() method if present.
//
//After that, the program uses a for loop to iterate through each character in the input string.
//Inside the loop, the program checks whether the character is a letter, digit, or a special character. If the character is a letter, it is appended to the letters string. If it is a digit, it is added to the digits string. Otherwise, if it is a special character, it is added to the specialChars string.
//
//Finally, the program prints out the separate groups of characters using the System.out.println() method,
//which displays the results in the format: "Letters in the char sequence are:
//{letters}", "Digits in the char sequence are: {digits}", and "Special Chars in the char sequence are: {specialChars}".