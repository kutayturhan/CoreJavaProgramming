/*
Write a Java program that takes a string as input and prints the frequency of each character in the string.

For example, if the input string is "aabcccd", the program should output "a2b1c3d1",
indicating that the letter 'a' appears twice, 'b' appears once, 'c' appears three times, and 'd' appears once.
*/
package java_NestedLoop;

import java.util.Scanner;

public class FrequencyOfChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String inputString = scan.nextLine();

        String result = "";

        for (int i = 0; i < inputString.length(); i++) {
            int frequency = 0;
            char chars1 = inputString.charAt(i);

            for (int j = 0; j < inputString.length(); j++) {
                char chars2 = inputString.charAt(j);

                if (chars1 == chars2) {
                    frequency++;
                }
            }

            if (result.contains(Character.toString(chars1))) {
                continue;
            }

            result += chars1;
            result += ":";
            result += frequency;
            result += " ";
        }

        System.out.println("Frequency of characters in the input string:" + result);
    }
}

//This program takes a string as input and calculates the frequency of each character in the string.
//It prompts the user to enter a string, reads it using a Scanner object, and stores it in the variable inputString.
//
//Next, it initializes an empty string called result that will be used to store the frequency of each character in the input string.
//Then, it uses two nested for loops to iterate over each character in the input string.
//
//In the outer loop, a variable called chars1 is assigned the i-th character of the input string.
//In the inner loop, another variable called chars2 is assigned the j-th character of the input string.
//If chars1 and chars2 are equal, it means that the frequency of chars1 needs to be incremented.
//Therefore, a frequency counter is initialized to 0 before the inner loop and is incremented every time chars1 is equal to chars2.
//
//After the inner loop, the program checks if the character represented by chars1 already exists in the result string.
//If it does, it continues to the next iteration of the outer loop. If it does not exist, the program adds the character and its frequency to the result string.
//
//Finally, the program prints out the frequency of each character in the input string by concatenating a string literal,
//"Frequency of characters in the input string:" with the result string that was built in the loop.
//The output will be a series of character-frequency pairs separated by spaces and colons, as shown in the example in the program's comment.