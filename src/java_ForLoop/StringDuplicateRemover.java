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

            if (!(outputString.contains(stringChar))){
                outputString += stringChar;
            }
        }

        System.out.println("The unique characters in the original string are: " + outputString);

    }
}

//This is a Java program that finds the unique characters in a given string by removing any duplicate characters.
//
//The program starts by defining two String variables: inputString, which holds the original string, and outputString,
//which will store the unique characters. Initially, outputString is an empty string.
//
//Next, the program uses a for loop to iterate through each character in the inputString. For each iteration,
//the program extracts the character at the current index using the charAt() method and stores it in a new string variable called stringChar.
//
//Then, the program checks whether the outputString already contains the stringChar by using the contains() method.
//If the outputString does contain the stringChar, the program continues to the next iteration of the loop without adding it to the outputString.
//If the outputString does not contain the stringChar, it is appended to the outputString using the += operator.
//
//Finally, the program uses System.out.println() to print a message that displays the unique characters in the original string by concatenating the outputString variable with a message.