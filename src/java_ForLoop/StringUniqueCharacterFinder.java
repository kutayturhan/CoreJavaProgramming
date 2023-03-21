/*
Write a Java program that takes a string as input and returns a new string containing only the unique characters from the original string.

For example, if the input string is "AABCCD", the output string should be "BD", since these are the only characters that appear exactly once in the original string.

To implement this program, you can use the indexOf() and lastIndexOf() methods of the String class.
If the first and last index positions of a character in the input string are the same,
that means the character appears only once in the string and should be added to the output string.
 */

package java_ForLoop;

public class StringUniqueCharacterFinder {

    public static void main(String[] args) {

        String inputString = "AABCCD";
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {

            String stringChar = Character.toString(inputString.charAt(i));

            if (inputString.indexOf(stringChar) == inputString.lastIndexOf(stringChar)) {
                outputString += stringChar;
            } else {
                continue;
            }
        }

        System.out.println("The unique characters in the original string are: " + outputString);
    }
}

//This is a Java program that finds unique characters from a given string.
//
//The program initializes two String variables: inputString which contains the input string and outputString,
//which is an empty string used to store the unique characters from the input string.
//
//Then, the program uses a for loop to iterate through each character in the input string.
//Inside the loop, it converts each character to a String and stores it in the stringChar variable.
//
//The program then checks if the inputString contains more than one instance of the stringChar.
//If it does, it continues to the next iteration of the loop using the continue keyword. If it doesn't, it adds the stringChar to the outputString.
//
//Finally, the program prints a message using System.out.println() that displays the unique characters in the original string by concatenating the outputString variable to a message.