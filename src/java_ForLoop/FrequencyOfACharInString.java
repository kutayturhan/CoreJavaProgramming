/*
Write a Java program that prompts the user to enter a string and a character, and then calculates and outputs the frequency of the character in the string.

For example, if the user enters the string "aabcccd" and the character 'c', the program should output "The frequency of 'c' in the string 'aabcccd' is 3".
If the user enters the string "Java programming language" and the character 'g', the program should output "The frequency of 'g' in the string 'Java programming language' is 4".
*/

package java_ForLoop;

import java.util.Scanner;

public class FrequencyOfACharInString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a string to calculate frequency of characters in it: ");
        String inputString = scan.nextLine();

        System.out.print("Please enter the character you want to calculate: ");
        char charToSearch = scan.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == charToSearch) {
                frequency++;
            }
        }

        System.out.println("The frequency of '" + charToSearch + "' in the string '" + inputString + "' is: " + frequency);

    }
}

// This is a Java program that prompts the user to enter a string and a character, and then calculates and outputs the frequency of the character in the string.
//
// The program first prompts the user to enter a string and a character using a Scanner object.
// It then initializes a variable 'frequency' to 0 to store the frequency of the given character in the string.
//
// The program then uses a for loop to iterate through each character in the input string.
// At each iteration, it checks if the current character is equal to the character entered by the user.
// If they are equal, it increments the frequency variable.
//
// Finally, the program prints the calculated frequency of the character in the input string using a formatted message that includes the character and the input string.