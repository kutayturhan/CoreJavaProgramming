/*
Write a Java program that takes as input two integer values (1 and 100),
computes the sum of all odd numbers within this range,
and outputs the result to the user in a readable format.
*/

package java_ForLoop;

public class SumOfOddNumbersInRange {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }

        System.out.println("The sum of odd numbers between 1 and 100 is: " + sum);
    }
}

//This Java program calculates the sum of all odd numbers between 1 and 100 and outputs the result to the user in a readable format.
//
//The main method starts by declaring and initializing the sum variable to 0. It then uses a for loop to iterate through all odd numbers between 1 and 100.
//The loop initializes a counter variable i to 1 and increments it by 2 at each iteration, which generates all odd numbers in the range.
//At each iteration, the loop adds the current odd number to the sum variable using the compound assignment operator "+=".
//
//Finally, the program prints the sum of all odd numbers between 1 and 100 to the console using the System.out.println() method.
//The output message is a formatted string that includes the sum value and an informative text that describes what the value represents.