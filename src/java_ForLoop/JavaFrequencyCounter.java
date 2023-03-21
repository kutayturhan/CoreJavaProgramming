/*
Write a class name for this task: Write a program that can count the frequency of the word "Java" in a given sentence.

For example:
If the sentence is "Java Java", the output should be 2.
*/

package java_ForLoop;

import java.util.Scanner;

public class JavaFrequencyCounter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the string you wanted to calculate the 'Java' word frequency: ");
        String inputString = scan.nextLine().toLowerCase();

        int javaFrequencyCount = 0;

        if (inputString.contains("java")) {
            for (int i = 0; i <= inputString.length() - 4; i++) {

                char inputStringChar = inputString.charAt(i);

                if (inputString.substring(i, i + 4).equals("java")) {
                    javaFrequencyCount++;
                }
            }

            System.out.println("The frequency of the word 'Java' in the input string is: " + javaFrequencyCount);

        } else {
            System.out.println("The input string does not contain the word 'Java'");
        }
    }
}

// This is a Java program that counts the frequency of the word "Java" in a given sentence entered by the user.
//
// The program prompts the user to enter a string and stores it in a variable called inputString.
// It then initializes a variable javaFrequencyCount to keep track of the frequency of the word "Java" in the input string.
//
// The program then checks if the input string contains the word "Java".
// If it does, the program enters a for loop that iterates through each character in the input string one by one.
//
// For each character, the program checks if the next four characters (including the current character) spell out the word "Java" using the substring method.
// If the condition is true, the javaFrequencyCount variable is incremented.
//
// After iterating through the entire input string, the program outputs the frequency of the word "Java" in the input string in a formatted message to the console.
// If the input string does not contain the word "Java", the program outputs a message saying so.
//
// Overall, this program takes a user inputted string and returns the frequency of the word "Java" within it.