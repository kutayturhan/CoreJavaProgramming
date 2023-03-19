/*
Write a Java program that can reverse any given string.

The program should prompt the user to enter a string, and then it should reverse the order of the characters in the string. It should then output the reversed string to the user.

For example, if the user inputs the string "Hello World", the program should output "dlroW olleH".
*/

package java_ForLoop;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string that you want to reverse: ");
        String str = scan.nextLine();

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Reversed version of the string you entered is: " + reversedStr);
    }
}

//This is a Java program that prompts the user to enter a string and then reverses the order of the characters in that string. The reversed string is then printed to the console.
//
//The program first creates a Scanner object to read input from the user via the console.
//It then prompts the user to enter the string that they want to reverse using the System.out.print() method.
//
//The user's input is read using the nextLine() method of the Scanner object and stored in a String variable named "str".
//
//The program initializes an empty String variable named "reversedStr" that will be used to store the reversed version of the input string.
//
//The program then uses a for loop to iterate through each character in the input string starting from the last character and moving backward to the first character.
//Inside the loop, the program uses the charAt() method to get the character at the current index, and appends that character to the "reversedStr" variable using the += operator.
//
//After the loop completes, the program prints the reversed string to the console using the System.out.println() method,
//along with a message indicating that it is the reversed version of the user's input.