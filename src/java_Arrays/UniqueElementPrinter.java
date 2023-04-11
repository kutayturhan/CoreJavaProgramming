/*
Write a Java program that accepts an array of strings as input and prints all the unique elements in the array.
 */

package java_Arrays;

import java.util.Arrays;

public class UniqueElementPrinter {

    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "cherry", "apple", "date", "elderberry", "fig", "grape", "banana", "honeydew"};
        String result = "";

        for (int i = 0; i < arr.length; i++) {

            String arrElement = arr[i];
            int frequency = 0;

            for (int j = 0; j < arr.length; j++) {

                String arrElement2 = arr[j];

                if (arrElement.equals(arrElement2)){
                    frequency++;
                }
            }

            if (frequency == 1){
                result += arr[i];
                result += " ";
            }
        }
        System.out.println("Unique elements in this array are: " + result);
    }
}

//This Java program takes an array of strings as input and prints all the unique elements in the array.
//The program first initializes the string array with some sample data. It then declares a variable 'result' to store the unique elements of the array.
//
//The program uses two nested for loops to iterate through the array.
//In the outer for loop, the program gets the element at the current index, and in the inner for loop,
//it compares this element with all the other elements of the array to check the frequency of the element.
//If the frequency of the element is 1, then it is unique and added to the 'result' variable with a space.
//
//After iterating through the array, the program prints the 'result' variable that contains all the unique elements of the array.