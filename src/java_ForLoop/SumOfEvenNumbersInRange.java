/*
Write a Java program that takes as input two integer values (1 and 100),
computes the sum of all even numbers within this range (inclusive),
and outputs the result to the user in a readable format.
*/

package java_ForLoop;

public class SumOfEvenNumbersInRange {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }

        System.out.println("The sum of even numbers between 1 and 100 (inclusive) is: " + sum);

    }
}
// This is a Java program that calculates the sum of all even numbers between 1 and 100 (inclusive).
//
// The program uses a for loop to iterate through all even numbers in the range.
// The loop initializes a counter variable i to 0 and iterates through all even numbers from 0 to 100.
// At each iteration, the loop adds the current even number to the sum variable.
//
// Finally, the program outputs the calculated sum of even numbers to the console in a readable format.