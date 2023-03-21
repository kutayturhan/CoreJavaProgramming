/*
Write a Java program that removes duplicate characters from a given string.
The program should take a string as input, and output a new string that contains only the unique characters from the original string.

Example:
Input: "AABBCCBC"
Output: "ABC"

Hint: You can create a new string and add each character of the original string to it, but only if the character is not already in the new string.
 */

package java_ForLoop;

public class StringDuplicateRemover {

    public static void main(String[] args) {

        String inputString = "AABBCCBC";
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {

            String stringChar = Character.toString(inputString.charAt(i));

            if (outputString.contains(stringChar)) {
                continue;
            } else {
                outputString += stringChar;
            }
        }

        System.out.println("The unique characters in the original string are: " + outputString);

    }
}

//This is a Java program that removes duplicate characters from a given string.
//
//The program initializes two String variables: inputString which contains the input string and outputString,
//which is an empty string used to store the unique characters from the input string.
//
//Then, the program uses a for loop to iterate through each character in the input string.
//Inside the loop, it converts each character to a String and stores it in the stringChar variable.
//
//The program then checks if the outputString already contains the stringChar.
//If it does, it continues to the next iteration of the loop using the continue keyword. If it doesn't, it adds the stringChar to the outputString.
//
//Finally, the program prints a message using System.out.println() that displays the unique characters in the original string by concatenating the outputString variable to a message.