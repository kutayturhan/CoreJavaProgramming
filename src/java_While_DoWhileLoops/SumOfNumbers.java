/*
Write a Java program that prompts the user to enter a series of numbers and calculates their sum until the user enters a negative number.
Once a negative number is entered, the program should display the sum of all the positive numbers entered.

The program should first prompt the user to enter a number.
If the number is negative, the program should immediately display a message indicating that no positive numbers were entered.
Otherwise, the program should add the number to a running total and continue to prompt the user for more numbers. This process should continue until the user enters a negative number.

After the user enters a negative number, the program should display the sum of all the positive numbers entered. The sum should be displayed with two decimal places.
*/

package java_While_DoWhileLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sum = 0.0;

        System.out.print("Please enter the first number: ");
        double num = scan.nextDouble();

        if (num < 0) {
            System.out.print("No positive numbers were entered.");
            return;
        }

        sum = num;

        while (true) {

            System.out.print("Please enter another number (negative to quit): ");
            num = scan.nextDouble();

            if (num < 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of positive numbers: " + sum);
    }
}

//This program prompts the user to enter a series of numbers and calculates their sum until the user enters a negative number.
//It first asks the user to enter the first number. If the number is negative, the program immediately displays a message indicating that no positive numbers were entered.
//Otherwise, the program adds the number to a running total and continues to prompt the user for more numbers until a negative number is entered.
//
//The sum of all the positive numbers entered is displayed with two decimal places.
//The program uses a while loop that continues to prompt the user for numbers until a negative number is entered.
//The loop breaks when a negative number is entered.
//
//The program uses a double variable to store the sum of the positive numbers entered because the sum may be a decimal value.
//The program also uses the return statement to exit the program early if the first number entered is negative, which eliminates the need for an additional check later in the program.