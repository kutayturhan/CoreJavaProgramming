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
