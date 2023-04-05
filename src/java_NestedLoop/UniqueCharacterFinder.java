/*
Write a Java program to find and print the unique characters in a given string, without using the index() and lastIndexOf() methods.

Example:
If the input string is "aabccdeef", the program should output "bdf", indicating that the characters 'b', 'd', and 'f' appear only once in the input string.
*/

package java_NestedLoop;

public class UniqueCharacterFinder {

    public static void main(String[] args) {

        String inputString = "aabccdeef";
        String result = "";

        for (int i = 0; i < inputString.length(); i++) {
            int frequency = 0;
            char stringChar = inputString.charAt(i);

            for (int j = 0; j < inputString.length(); j++) {
                char stringChar2 = inputString.charAt(j);

                if (stringChar == stringChar2) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                result += stringChar;
            }

        }

        if (result.length() <= 0){
            System.out.println("This string does not contain any unique character.");
        } else if (result.length() == 1){
            System.out.println("Unique character in the string is: " + result);
        } else {
            System.out.println("Unique characters in the string are: " + result);
        }
    }
}

//This Java program finds and prints the unique characters in a given string, without using the index() and lastIndexOf() methods.
//
//The input string is set to "aabccdeef" in the main method. A new empty string is also created to store the unique characters found in the input string.
//
//The program uses a nested loop to iterate over the characters in the input string.
//The outer loop iterates over each character of the input string, while the inner loop compares that character with all other characters of the string.
//For each character, the program counts how many times it appears in the input string by comparing it with every other character.
//
//If a character appears only once, it is considered unique and is added to the result string.
//The program then checks the length of the result string.
//If it is zero, the program prints a message indicating that the input string contains no unique characters.
//If the length of the result string is one, the program prints a message indicating that the input string contains only one unique character.
//If the length of the result string is greater than one, the program prints a message indicating that the input string contains multiple unique characters.