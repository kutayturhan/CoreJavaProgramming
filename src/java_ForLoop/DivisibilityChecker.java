/*
Write a Java program that prints the numbers between 1 and N that are divisible by 3, 5, and 15.
The program should output the numbers in three different sections based on their divisibility criteria.
If a number is divisible by 3, 5, and 15, it should be displayed only in the "DivisibleBy15" section.
If a number is divisible by 3 but not by 15, it should only be displayed in the "DivisibleBy3" section.
If a number is divisible by 5 but not by 15, it should only be displayed in the "DivisibleBy5" section.

Example:

Input: 100

Output:
Divisible By 15: 15 30 45 60 75 90
Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
*/

package java_ForLoop;

import java.util.Scanner;

public class DivisibilityChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number for divisibility checker: ");
        int maxNumber = scan.nextInt();

        String divisibleBy15Number = "";
        String divisibleBy5Number = "";
        String divisibleBy3Number = "";

        for (int i = 1; i <= maxNumber; i++) {
            if (i % 15 == 0) {
                divisibleBy15Number += i + " ";
            } else if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5Number += i + " ";
            } else if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3Number += i + " ";
            }
        }

        System.out.println("Divisible by 15 result: " + divisibleBy15Number);
        System.out.println("Divisible by 5 result: " + divisibleBy5Number);
        System.out.println("Divisible by 3 result: " + divisibleBy3Number);
    }
}

//This is a Java program that takes an integer input from the user and then checks for numbers between 1 and that input number that are divisible by 3, 5, and 15.
//The program then outputs the numbers in three different sections based on their divisibility criteria.
//
//The program uses a for loop to iterate through all the numbers from 1 to the input number.
//Inside the loop, it uses if-else statements to check if the current number is divisible by 15, 5, or 3.
// If the number is divisible by 15, it is added to the divisibleBy15Number string variable.
//If the number is divisible by 5 but not 15, it is added to the divisibleBy5Number string variable.
//If the number is divisible by 3 but not 15, it is added to the divisibleBy3Number string variable.
//
//Finally, the program outputs the results of the divisibility checks using System.out.println() statements.
//The variable names have been chosen to be descriptive and self-explanatory,
//while the input prompt and output statements have been written in plain language for the user's understanding.