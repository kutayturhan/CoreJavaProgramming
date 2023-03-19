/*
Write a Java program that checks whether a given string is a palindrome or not.

A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.

The program should prompt the user to enter a string, and then it should determine whether the string is a palindrome or not.
If the string is a palindrome, the program should output "true", and if it is not, the program should output "false".

For example, if the user inputs the string "Level", the program should output "true" because "Level" reads the same backward as forward.
If the user inputs the string "Anna", the program should output "true" because "Anna" is also a palindrome.
If the user inputs the string "hello", the program should output "false" because "hello" is not a palindrome.
*/

package java_ForLoop;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word to check if it is a palindrome or not: ");
        String word = scan.next().toLowerCase();

        boolean isPalindrome = false;

        for (int i = 0, j = word.length() - 1; i < word.length() && j >= 0; i++, j--) {

            char starterWordCharacters = word.charAt(i);
            char endWordCharacters = word.charAt(j);

            if (starterWordCharacters == endWordCharacters) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("The word you entered is a palindrome.");
        } else {
            System.out.println("The word you have entered is not a palindrome.");
        }
    }
}

//The Java program prompts the user to enter a word and then checks if the word is a palindrome or not.
//
//The program first uses the Scanner class to accept a string input from the user.
//Then, it converts the input string to lowercase using the toLowerCase() method to ensure that the program is case-insensitive.
//
//After that, the program initializes a boolean variable called isPalindrome to false, which will be used to determine whether the word is a palindrome or not.
//
//Next, the program uses a for loop to iterate through each character in the word. The loop initializes two integer variables, i and j,
//which point to the first and last characters in the word, respectively. The loop checks whether the characters pointed to by i and j are equal.
//If they are equal, isPalindrome is set to true. If they are not equal, isPalindrome is set to false.
//The loop continues until i is less than the length of the word and j is greater than or equal to zero.
//
//Finally, the program prints out whether the word entered by the user is a palindrome or not using the System.out.println() method.
//If isPalindrome is true, the program outputs "The word you entered is a palindrome." If isPalindrome is false, the program outputs "The word you have entered is not a palindrome.".