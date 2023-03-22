/*
Develop a Java program that prompts the user to input two numbers and a mathematical operator.
The program should then compute the result of the operation based on the provided operator.

If the operator entered by the user is not one of the four valid operators (+, -, *, /),
the program should notify the user that the operator is invalid and prompt them to enter a valid operator.
This process should continue until the user provides a valid operator and the program is able to compute the result.
 */

package java_While_DoWhileLoops;

import java.util.Scanner;

public class OperatorInputProcessor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Please enter a valid operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.print("Please enter a valid operator: ");
            operator = scan.next().charAt(0);
        }

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

        System.out.println("The result of the operation is: " + result);
    }
}

//This Java program prompts the user to input two numbers and a mathematical operator.
//It then computes the result of the operation based on the provided operator.
//
//The program begins by creating a Scanner object to read input from the user.
//It then prompts the user to enter the first and second numbers using System.out.print and reads their input using scan.nextInt().
//
//Next, the program prompts the user to enter a valid operator (+, -, *, /) using System.out.print and reads their input using scan.next().charAt(0).
//If the operator entered by the user is not one of the four valid operators, the program enters a while loop that continues to prompt the user to enter a valid operator until one is entered.
//
//After a valid operator is entered, the program uses if-else statements to determine which operation to perform on the two numbers based on the operator entered.
//It then computes the result and stores it in the result variable.
//
//Finally, the program outputs the result using System.out.println along with a message that indicates what the result represents.
//The variable names and output messages are clear and concise, making the program easy to understand.