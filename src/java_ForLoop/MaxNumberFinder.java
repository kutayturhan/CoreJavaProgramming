package java_ForLoop;

import java.util.Scanner;

public class MaxNumberFinder {

    public static void main(String[] args) {
/*
Write a Java program that prompts the user to enter 5 numbers.
The program should then determine and output the largest number among the input values.
*/
        Scanner scan = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            int number = scan.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        System.out.print("Largest number is: " + largestNumber);

    }
}

//The given code is a Java program that prompts the user to enter 5 numbers and finds the largest number among them.
//The program uses a for loop to prompt the user for each number, and compares the entered number with the previously entered numbers to determine the largest number.
//The program uses the Scanner class to read the user input from the console.
//It initializes a variable largestNumber to the smallest possible integer value, and updates it with the input number if it is greater than the current largest number.