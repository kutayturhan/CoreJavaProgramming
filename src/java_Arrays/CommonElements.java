/*
Write a Java program that finds and prints the common elements between two integer arrays.

The program should accept two integer arrays as input and compare each element of the first array to every element of the second array.
If there is a match, the program should print the common element on a new line.

For example, if the input arrays are:

arr1: {1, 2, 3, 4, 5}
arr2: {4, 5, 6, 7, 8}

the program should output:

4
5
*/

package java_Arrays;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

//This code is a Java program that finds and prints the common elements between two integer arrays.
//
//The program first declares two integer arrays, "arr1" and "arr2", and initializes them with some values.
//
//The program then uses two nested loops to compare every element of "arr1" with every element of "arr2".
//If a match is found between an element of "arr1" and an element of "arr2", the common element is printed to the console on a new line.
//
//The output of the program is the common elements between the two arrays, which are found by comparing each element of the first array to every element of the second array.
//In the example given in the comments, the output should be "4" and "5" since those are the elements that appear in both arrays.