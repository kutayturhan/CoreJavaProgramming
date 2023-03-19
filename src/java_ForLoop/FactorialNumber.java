/*
Write a Java program that can calculate and return the factorial of any given number.
The program should prompt the user to enter an integer value, calculate its factorial, and then print out the result.
The factorial of a number is the product of all positive integers from 1 to that number.
For example, the factorial of 5 is 5 x 4 x 3 x 2 x 1 = 120.
*/

package java_ForLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer to calculate its factorial value: ");
        int number = scan.nextInt();

        int factorialValue = 1;

        if (number < 1) {
            System.err.println("Error: Invalid input. Please enter a positive integer.");
            return;
        } else {
            for (int i = 1; i <= number; i++) {
                factorialValue *= i;
            }
        }

        System.out.println("The factorial value of " + number + " is " + factorialValue + ".");

    }
}

//This is a Java program that calculates the factorial of any given positive integer number entered by the user.
//The program uses a Scanner object to prompt the user to input a positive integer value.
//
//The program first checks if the entered number is a positive integer greater than or equal to 1.
//If the input is invalid, the program prints an error message to the console and returns from the main method.
//
//If the input is valid, the program calculates the factorial of the input number by using a for loop.
//The for loop initializes a counter variable i to 1 and iterates through all values from 1 to the input number.
//At each iteration, the loop multiplies the current value of the factorialValue variable by the current value of the counter variable i.
//
//Finally, the program prints the calculated factorial value of the input number to the console.
//The result is displayed in a formatted message that includes the input number and the calculated factorial value.