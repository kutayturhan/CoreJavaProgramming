/*
Write a Java program that calculates the sum of all numbers between 1 and a given positive integer.

The program should prompt the user to enter a positive integer. It should then calculate the sum of all integers from 1 to the given integer, and output the result to the user.

For example, if the user inputs the integer 100, the program should output the result 5050, which is the sum of all integers from 1 to 100.
Similarly, if the user inputs the integer 50, the program should output the result 1275, which is the sum of all integers from 1 to 50.

Make sure to handle invalid input by checking if the input is a positive integer.
*/

package java_ForLoop;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();

        int sumOfIntegers = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sumOfIntegers += i;
            }
            System.out.println("Sum of all integers from 1 to " + num + " is: " + sumOfIntegers + ".");
        } else {
            System.out.println("Invalid input. Please enter a positive integer and try again.");
        }
    }
}

//This is a Java program that calculates the sum of all integers between 1 and a given positive integer entered by the user, using a for loop.
//
//The program first creates a Scanner object to read input from the user via the console.
//It then prompts the user to enter a positive integer using the System.out.print() method.
//
//The user's input is read using the nextInt() method of the Scanner object and stored in an integer variable named "num".
//
//The program initializes an integer variable named "sumOfIntegers" to zero that will be used to store the sum of all integers between 1 and the user's input integer.
//
//The program then uses an if-else statement to check if the input integer is positive.
//If it is positive, the program enters a for loop that iterates from 1 to the input integer using a loop variable "i".
//
//Inside the loop, the program adds the value of the loop variable "i" to the "sumOfIntegers" variable using the += operator.
//
//After the loop completes, the program prints the sum of all integers between 1 and the input integer to the console using the System.out.println() method,
//along with a message that indicates the range of integers used to calculate the sum.
//
//If the user enters a non-positive integer, the program outputs an error message asking the user to enter a positive integer and terminates without calculating the sum.