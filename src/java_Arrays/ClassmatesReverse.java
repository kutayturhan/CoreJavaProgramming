/*
Write a Java program that declares a string array called "classmates" and stores the full names of 10 classmates.
The program should then reverse each student's name and print them on separate lines.

For example, if the input array is {"Alice Smith", "Bob Johnson", "Charlie Brown"}, the program should output:

htimS ecilA
nosnhoJ boB
nworb eilrahC
*/

package java_Arrays;

public class ClassmatesReverse {

    public static void main(String[] args) {

        String[] classmates = {"Alice Smith", "Bob Johnson", "Charlie Brown"};

        for (int i = 0; i < classmates.length; i++) {
            String fullName = classmates[i];
            String reversedName = "";

            for (int j = fullName.length() - 1; j >= 0; j--) {
                reversedName += fullName.charAt(j);
            }

            System.out.println(reversedName);
        }
    }
}

//This is a Java program that demonstrates how to reverse the names in a string array called "classmates".
//The program first declares the array and initializes it with three full names.
//It then uses a for loop to iterate through each name in the array, reversing it and storing it in a new string variable called "reversedName".
//
//To reverse the name, the program uses another for loop that starts at the end of the string (i.e., its last character) and iterates backwards to its first character.
//Within the loop, the program retrieves each character of the name using the charAt method and appends it to the "reversedName" variable.
//
//Finally, the program prints the reversed name on a separate line using the println method.
//The output shows each name in the array in reverse order.