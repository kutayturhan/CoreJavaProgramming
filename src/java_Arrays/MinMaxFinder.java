/*
Write a Java program that asks the user to input 10 numbers and stores them in an array.
Then, find and print the maximum and minimum values in the array.
 */

package java_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Please enter 10 numbers.");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int nums = scan.nextInt();
            arr[i] = nums;

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Your array is: " + Arrays.toString(arr));
        System.out.println("Min number in this array is: " + min);
        System.out.println("Max number in this array is: " + max);

        scan.close();
    }
}