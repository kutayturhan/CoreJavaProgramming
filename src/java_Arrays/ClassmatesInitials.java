/*
Write a Java program that declares an array called "classmates" and stores the full names of 10 classmates.
The program should then print the initials of each classmate on a separate line.
*/

package java_Arrays;

public class ClassmatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Alice Smith", "Bob Johnson", "Charlie Brown", "David Lee", "Emily Davis", "Frank Garcia", "Grace Kim", "Henry Nguyen", "Isabella Hernandez", "John Chen"};


        for (int i = 0; i < classmates.length; i++) {

            String fullName = classmates[i];
            String firstNameInitial = Character.toString(fullName.charAt(0));
            String lastNameInitial = Character.toString(fullName.charAt(fullName.indexOf(" ") + 1));

            String classmateInitials = firstNameInitial + "." + lastNameInitial;

            System.out.println(classmateInitials);
        }
    }
}

//This Java program creates an array called "classmates" that stores the full names of 10 classmates.
//It then iterates through each element in the array and extracts the first and last initials of each name.
//The program then concatenates the two initials with a period separator and prints them on separate lines.
//
//To extract the initials, the program uses the charAt() method to retrieve the first character of the first name and the character after the space in the last name.
//It then converts each character to a string using Character.toString(), concatenates the strings with a period separator, and stores the result in a classmateInitials variable.
//Finally, the program uses System.out.println() to print the initials on separate lines.