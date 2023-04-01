/*
Write a Java program that works as a simple calculator. The program should follow the steps below:

Prompt the user to enter the first number.
Ask the user to enter a mathematical operator (+, -, *, /).
If the user enters an invalid operator, prompt them to enter a valid operator until they provide one.
Prompt the user to enter the second number.
Perform the operation on the two numbers entered by the user.
Display the result.
Ask the user if they want to continue.
If the user enters "yes", repeat steps 1-6.
If the user enters "no", print "Thanks for using the calculator!" and end the program.
If the user enters an invalid entry, prompt them to enter a valid entry until they provide one.
*/


package java_NestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("Please enter the first number: ");
            int num1 = scan.nextInt();

            System.out.print("Please enter a mathematical operator (+, -, *, /): ");
            char operator = scan.next().charAt(0);

            while (!((operator == '+') || (operator == '-') || (operator == '*') || (operator == '/'))) {
                System.out.println("You have entered an invalid input.");
                System.out.print("Please enter a valid mathematical operator (+, -, *, /): ");
                operator = scan.next().charAt(0);
            }

            System.out.print("Please enter the second number: ");
            int num2 = scan.nextInt();

            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

            System.out.println("The result is: " + result);

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scan.next();

            while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
                System.out.println("You have entered an invalid input.");
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scan.next();
            }

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using the calculator!");
                break;
            }
        }
    }
}

//This program is a simple calculator that prompts the user to enter two numbers and a mathematical operator, performs the operation on the two numbers entered, and displays the result.
//It then asks the user if they want to continue, and if so, repeats the process.
//
//The program uses a while loop to keep asking the user for input and performing calculations until the user chooses to exit by entering "no" when asked if they want to continue.
//
//The program also includes error checking to make sure the user enters a valid mathematical operator and choice to continue.
//If the user enters an invalid operator or choice, the program prompts the user to enter a valid input until they provide one.
//
//The program uses a Scanner object to read user input from the console.
//It prompts the user to enter the first number, the operator, and the second number, and reads these values using the Scanner's nextInt() and next().charAt(0) methods.
//
//After performing the calculation, the program uses a conditional statement to check if the user wants to continue or not,
//and if not, it prints a "Thanks for using the calculator!" message and ends the program.