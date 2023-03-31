/*
Write a Java program that can perform division of two positive numbers without using the division (/) and multiplication (*) operators.
*/

package java_While_DoWhileLoops;

public class DivisionWithoutOperators {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 4;

        int result = 0;

        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }

        System.out.println("The result of the division is: " + result);
    }
}

//This Java program performs division of two positive numbers without using the division (/) and multiplication (*) operators.
//
//The program first initializes the two positive numbers to be divided, num1 and num2, and sets an initial value of 0 to the result variable.
//
//It then enters a while loop that continues until the value of num1 is less than num2.
//Within the loop, the value of num1 is decremented by the value of num2 and the result variable is incremented by 1.
//This process is repeated until the value of num1 becomes less than num2, at which point the loop terminates.