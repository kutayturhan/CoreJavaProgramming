/*
Write a Java program that prompts the user to enter the length of an array and the values of each element in the array.
The program should then display the entered values in the console.

If the entered length is less than 1, the program should terminate.

Example Output:

Enter the length of the array: 5
Enter the values of the array:
1
2
3
4
5
Entered values of the array: [1, 2, 3, 4, 5]
*/
package java_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the length of the array: ");
        int length = scan.nextInt();

        if (length < 1) {
            System.out.println("Invalid entry.");
            System.out.println("Program is terminating.");
            System.exit(0);
        }

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Please enter the value for index " + i + ": ");
            int nums = scan.nextInt();

            arr[i] = nums;
        }

        System.out.println("Entered values of the array: " + Arrays.toString(arr));
    }
}

//This Java program prompts the user to input the length and the values of each element in an array, and then displays the entered values in the console.
//If the entered length is less than 1, the program terminates.
//
//The program begins by importing the necessary classes for the program to function, including the Arrays and Scanner classes.
//It then defines a public class called ArrayInput.
//
//Within the class, the main() method is defined to execute the program. First, a Scanner object named scan is created to read the user's inputs.
//
//The user is then prompted to enter the length of the array using System.out.print().
//The program reads the user's input with scan.nextInt(), and stores it as an integer variable length.
//
//Next, an if statement checks whether the length entered by the user is less than 1.
//If the condition is true, the program prints a message indicating that the entry is invalid and terminates the program using System.exit(0);.
//
//If the length entered is greater than or equal to 1, the program creates an array of integers named arr with the specified length.
//The for loop is used to prompt the user to input each element of the array by displaying the message;
//Please enter the value for index [i]: for each iteration, where i is the current index.
//
//The program reads the user's input with scan.nextInt(), and stores it as an integer variable nums at the current index of the array.
//
//Once the loop is complete, the program uses Arrays.toString() method to print the values entered by the user in the console.