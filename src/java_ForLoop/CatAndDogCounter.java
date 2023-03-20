/*
Write a Java program that determines whether the strings "cat" and "dog" appear an equal number of times in a given sentence.

For example, if the input sentence is "caT dog dogG cAt", the program should output "true" because "cat" and "dog" each appear twice in the sentence.
*/

package java_ForLoop;

import java.util.Scanner;

public class CatAndDogCounter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = scan.nextLine().toLowerCase();

        int catCount = 0, dogCount = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 3).equals("cat")) {
                catCount++;
            } else if (sentence.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }

        boolean areEqual = (catCount == dogCount);

        if (areEqual) {
            System.out.println("The number of cats in the sentence is equal to the number of dogs.");
        } else {
            System.out.println("The number of cats in the sentence is not equal to the number of dogs.");
        }
    }
}

//This is a Java program that determines whether the strings "cat" and "dog" appear an equal number of times in a given sentence.
//
//The program prompts the user to input a sentence, which is then converted to lowercase to make the comparison case-insensitive.
//
//It then uses a for loop to iterate through all possible substrings of length 3 in the sentence.
//Each substring is compared with the strings "cat" and "dog" to determine whether they appear in the sentence.
//The count of the number of times each string appears is incremented accordingly.
//
//After counting the occurrences of "cat" and "dog" in the sentence, the program compares their respective counts to determine whether they appear an equal number of times.
//
//Finally, the program outputs a message to the console depending on whether the number of "cat" and "dog" occurrences are equal or not.