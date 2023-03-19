/*
Write a Java program that prompts the user to enter 5 numbers.
The program should then determine and output the smallest number among the input values.
*/

package java_ForLoop;

import java.util.Scanner;

public class MinimumNumberFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++){

            System.out.print("Enter number " + i + ": ");
            int number = scan.nextInt();

            if (number < smallestNumber){
                smallestNumber = number;
            }
        }

        System.out.println("Minimum number is: " + smallestNumber);

    }
}

//The given code is a Java program that prompts the user to enter 5 numbers and finds the smallest number among them.
//The program uses a for loop to prompt the user for each number, and compares the entered number with the previously entered numbers to determine the smallest number.
//The program uses the Scanner class to read the user input from the console.
//It initializes a variable smallestNumber to the largest possible integer value, and updates it with the input number if it is smaller than the current smallest number.