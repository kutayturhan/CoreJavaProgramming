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
            System.out.println("You have entered an invalid input. Please enter an invalid input.");
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

            System.out.println("You have entered an invalid input. Please enter an invalid input.");
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