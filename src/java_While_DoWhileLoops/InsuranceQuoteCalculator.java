/*
Write a Java program that calculates the insurance cost of a person based on the following information:

1. Ask the user to enter their name.
2. Ask the user to enter their gender.
3. Ask the user if they are married (yes/no).
4. Ask the user to enter their age. The age cannot be negative or greater than 120.
5. Ask the user to enter how many miles they drive in a day. The mileage cannot be negative or less than 5.
6. Ask the user if they want full coverage or liability insurance.
7. Ask the user if they have had any accidents or claims in the past 5 years (yes/no).
8. Ask the user if their car has an anti-theft device (yes/no).

If the user enters an invalid entry, ask them to re-enter until they provide a valid entry.

The program should then calculate the price of the insurance and display all of the user's information. The following calculation rules apply:

Starting prices for liability insurance:

Age < 25: $90
Age >= 25: $50
Miles <= 10: $10
Miles > 10 and <= 50: $30
Miles > 50: $50
Starting prices for full coverage insurance:

Age < 25: $160
Age >= 25: $120
Miles <= 10: $20
Miles > 10 and <= 50: $40
Miles > 50: $70
If the car has an anti-theft device, there is a 5% discount.

If the user has had any accidents or claims in the past 5 years, there is a 15% extra charge.

If the user has never had any accidents or claims in the past 5 years, there is a 10% discount.

If the user is married, there is a 5% discount.
*/

package java_While_DoWhileLoops;

import java.util.Scanner;

public class InsuranceQuoteCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        System.out.print("Please enter your gender: ");
        String gender = scan.next();

        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.print("Please enter a valid gender: ");
            gender = scan.next();
        }

        System.out.print("Are you married? 'Yes/No': ");
        String isMarried = scan.next();

        while (!(isMarried.equalsIgnoreCase("yes") || isMarried.equalsIgnoreCase("no"))) {
            System.out.println("Please enter a valid answer.");
            System.out.print("Are you married? 'Yes/No': ");
            isMarried = scan.next();
        }

        System.out.print("Please enter your age: ");
        int age = scan.nextInt();

        while (age > 120 || age < 0) {
            System.out.print("Please enter a valid age: ");
            age = scan.nextInt();
        }

        System.out.print("Please enter how many miles do you drive in a day: ");
        int miles = scan.nextInt();

        while (miles < 5) {
            System.out.print("Please enter a valid mileage: ");
            miles = scan.nextInt();
        }

        System.out.print("Would you like to have full coverage or liability insurance? Full coverage or Liability: ");
        scan.nextLine();
        String insurance = scan.nextLine();

        while (!(insurance.equalsIgnoreCase("full coverage") || insurance.equalsIgnoreCase("liability"))) {
            System.out.println("Please enter a valid answer.");
            System.out.print("Would you like to have full coverage or liability insurance? Full coverage or Liability: ");
            insurance = scan.nextLine();
        }

        System.out.print("Did you had any accidents or claims in the past 5 years? Yes/No: ");
        String hadAccidentOrClaims = scan.next();

        while (!(hadAccidentOrClaims.equalsIgnoreCase("yes") || hadAccidentOrClaims.equalsIgnoreCase("no"))) {
            System.out.println("Please enter a valid answer.");
            System.out.print("Did you had any accidents or claims in the past 5 years? Yes/No: ");
            hadAccidentOrClaims = scan.next();
        }

        System.out.print("Do you have any anti-theft device for your car? Yes/No: ");
        String antiTheftDevice = scan.next();

        while (!(antiTheftDevice.equalsIgnoreCase("yes") || antiTheftDevice.equalsIgnoreCase("no"))) {
            System.out.println("Please enter a valid answer.");
            System.out.print("Do you have any anti-theft device for your car? Yes/No: ");
            antiTheftDevice = scan.next();
        }

        double price = 0;

        if (insurance.equalsIgnoreCase("liability")) {

            if (age < 25) {
                price += 90;
            } else {
                price += 50;
            }

            if (miles <= 10) {
                price += 10;
            } else if (miles <= 50) {
                price += 30;
            } else {
                price += 50;
            }

        } else {

            if (age < 25) {
                price += 160;
            } else {
                price += 120;
            }

            if (miles <= 10) {
                price += 20;
            } else if (miles <= 50) {
                price += 40;
            } else {
                price += 70;
            }
        }

        double discountRate = 0;

        if (antiTheftDevice.equalsIgnoreCase("yes")) {
            discountRate += 5;
        }

        if (hadAccidentOrClaims.equalsIgnoreCase("yes")) {
            discountRate -= 15;
        } else {
            discountRate += 10;
        }

        if (isMarried.equalsIgnoreCase("yes")) {
            discountRate += 5;
        }

        price -= (price * (discountRate / 100));

        System.out.println("\nName: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + isMarried);
        System.out.println("Age: " + age);
        System.out.println("Miles driven per day: " + miles);
        System.out.println("Insurance type: " + insurance);
        System.out.println("Anti-theft device: " + antiTheftDevice);
        System.out.println("Accidents or claims in the past 5 years: " + hadAccidentOrClaims);
        System.out.println("Discount/Extra Charge rate: " + discountRate + "%");
        System.out.println("Total insurance cost: $" + price);

        scan.close();
    }
}

//The code is for a program that calculates the cost of car insurance for a user based on various inputs,
//such as their age, gender, marital status, driving habits, insurance type, and history of accidents or claims.
//
//The program starts by creating a Scanner object to read input from the user.
//It then prompts the user to enter their name, gender, and marital status, and uses a while loop to validate the inputs.
//If the user enters an invalid gender or marital status, the program will prompt them to enter a valid one until they do.
//
//Next, the program prompts the user to enter their age and how many miles they drive in a day.
//It again uses while loops to validate the inputs, ensuring that the user enters a valid age and a mileage greater than 5.
//
//The program then asks the user whether they want full coverage or liability insurance, and again uses a while loop to validate the input.
//
//The next input the program requests is whether the user has had any accidents or claims in the past 5 years and whether they have an anti-theft device for their car.
//The program uses while loops to validate these inputs as well.
//
//Once all inputs are validated, the program calculates the cost of the insurance based on the user's inputs.
//If the user chooses liability insurance, the cost is calculated based on their age and how many miles they drive per day.
//If the user chooses full coverage insurance, the cost is calculated based on the same factors, but with higher base costs.
//
//The program also calculates a discount or extra charge rate based on whether the user has an anti-theft device,
//has had any accidents or claims in the past 5 years, and is married or not.
//The discount rate is subtracted from or added to the cost of the insurance, and the final cost is displayed to the user along with all their inputs.
//
//Finally, the program closes the Scanner object to free up system resources.