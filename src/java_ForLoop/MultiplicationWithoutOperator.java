/*
Task: Write a Java program that prompts the user to enter two positive numbers and multiplies them without using the multiplication (*) operator.
If the user enters any negative numbers, the program should print "Invalid".
*/

package java_ForLoop;

import java.util.Scanner;

public class MultiplicationWithoutOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first positive number: ");
        int firstNum = scan.nextInt();

        System.out.print("Please enter the second positive number: ");
        int secondNum = scan.nextInt();

        int multiplication = 0;

        if (firstNum > 0 && secondNum > 0) {
            for (int i = 0; i < secondNum; i++) {
                multiplication += firstNum;
            }
        } else {
            System.out.println("Invalid input. Please enter positive numbers only.");
        }

        System.out.println("The multiplication of " + firstNum + " and " + secondNum + " is: " + multiplication);

    }
}

//This is a Java program that prompts the user to enter two positive numbers and multiplies them without using the multiplication (*) operator.
//
//The program uses a Scanner object to prompt the user to enter two positive numbers.
//It then initializes a variable to hold the multiplication value and checks if both numbers are positive before performing the multiplication.

//If the input numbers are not positive, the program outputs an error message to the console.
//
//The program then uses a for loop to calculate the multiplication of the two numbers entered by the user without using the multiplication operator.
//The loop iterates through the second number, adding the first number to the multiplication value in each iteration.
//
//After completing the multiplication, the program outputs the multiplication value in a formatted message to the console.