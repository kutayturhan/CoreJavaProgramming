/*
Write a Java program that allows users to reserve a hotel room.

The program should prompt the user to indicate whether they want to reserve a room.
If the user responds affirmatively, the program should ask the user to specify the type of room they would like to reserve: King Bed, Queen Bed, or Single Bed.
If the user responds negatively, the program should print "Have a nice day."

If the user provides any input other than "yes" or "no," the program should ask the user to reenter their response until they provide a valid input.
Similarly, if the user selects an invalid room type, the program should prompt the user to reselect their room type until they provide a valid input.

The program should display the type of room the user has reserved and the total cost of the reservation. The cost for each type of room is as follows:

King Bed: $120
Queen Bed: $100
Single Bed: $80
*/

package java_While_DoWhileLoops;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome. Would you like to reserve a room? Yes/No: ");
        String reservationRespond = scan.next();

        while (!(reservationRespond.equalsIgnoreCase("yes") || reservationRespond.equalsIgnoreCase("no"))) {
            System.out.println("You have entered an invalid input. Please enter an valid input.");
            System.out.print("Would you like to reserve a room? Yes/No: ");
            reservationRespond = scan.next();
        }

        if (reservationRespond.equalsIgnoreCase("yes")) {
            System.out.println("What kind of room would you like to reserve?");
            System.out.println("King Bed: $120");
            System.out.println("Queen Bed: $100");
            System.out.println("Single Bed: $80");
            System.out.print("King Bed / Queen Bed / Single Bed: ");
        } else {
            System.out.println("Have a nice day.");
        }

        scan.nextLine();
        String roomType = scan.nextLine();

        while (!(roomType.equalsIgnoreCase("king bed") ||
                roomType.equalsIgnoreCase("queen bed") ||
                roomType.equalsIgnoreCase("single bed"))) {

            System.out.println("You have entered an invalid input. Please enter a valid input.");
            System.out.println("What kind of room would you like to reserve?");
            System.out.print("King Bed / Queen Bed / Single Bed: ");
            roomType = scan.nextLine();
        }

        int total = 0;

        if (roomType.equalsIgnoreCase("king bed")) {
            total = 120;
        } else if (roomType.equalsIgnoreCase("queen bed")) {
            total = 100;
        } else {
            total = 80;
        }

        System.out.println("The amount you need to pay is: $" + total);

        scan.close();
    }
}

//This code is a Java program that simulates a hotel room reservation system.
//
//It prompts the user to indicate whether they want to reserve a room, and if so, it asks the user to specify the type of room they would like to reserve.
//The program checks the user's input to make sure it is valid and provides the total cost of the reservation.
//
//The program uses a Scanner object to read user input from the console.
//The first input prompt asks the user if they want to reserve a room.
//If the user enters an invalid response (other than "yes" or "no"), the program prompts the user to reenter their response until they provide a valid input.
//If the user responds affirmatively, the program then prints out the options for the room types and prompts the user to select one.
//
//Similarly, the program checks the user's input for room type to make sure it is valid.
//If the user enters an invalid response, the program prompts the user to reenter their response until they provide a valid input.
//The program then calculates the total cost of the reservation based on the user's room type selection and prints it out.
//
//The code uses a while loop to repeat the input prompt until the user provides a valid response.
//It uses if-else statements to check the user's input and calculate the total cost of the reservation.
//Finally, the program uses the close() method of the Scanner object to close the scanner and release its resources.