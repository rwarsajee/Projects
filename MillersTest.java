/**
 * File Name: MillersTest
 * Rashid Warsajee 040946714
 * CST8284
 * Professor Daniel Cormier
 * Lab 5
 * Due 11/12/23
 */

/**
 * @author Rashid Warsajee
 * @since 17.0.7
 * @version 1.1
 * @purpose MillereTest main class
 */


package polymorphism;

import java.util.Scanner;

/**
 * This class represents the test scenario for the miller payment system.
 * It allows users to input hours worked by different millers and calculates their bi-weekly pay.
 */
public class MillersTest {

    /**
     * The main method where we execuite the program
     *
     * @param args the command-line arguments 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Our MillersArray with our initial 3 roles
        Millers[] millersArray = new Millers[]{
                new Employees("Rashid W", 50000),
                new Consultants("Gojo S", 20.0),
                new Supervisors("Toji F", 70000, 2000)
        };

        // Loop through pre-established millers and ask user for their hours
        for (Millers miller : millersArray) {
            System.out.print("Enter the hours done by " + miller.getName() + ": ");
            int hoursWorked = scanner.nextInt();

            // Displaying the total pay for each miller
            System.out.println("Total Pay for " + miller.getName() + " is: " + miller.biWeeklyPay(hoursWorked));
            System.out.println();
        }

        // Adding a new millerr based on users input
        System.out.print("Enter the name of the new miller: ");
        String name = scanner.next();

        System.out.print("Enter the type of miller (1 for Employee, 2 for Consultant, 3 for Supervisor): ");
        int millerType = scanner.nextInt();
   
        
        // Using switch to create the 3 different roles and a default if improper input 
        Millers newMiller;
        switch (millerType) {
            case 1:
                newMiller = new Employees(name, 50000);
                break;
            case 2:
                newMiller = new Consultants(name, 20.0);
                break;
            case 3:
                newMiller = new Supervisors(name, 70000, 2000);
                break;
            default:
                System.out.println("Invalid miller name, will default to Employee");
                newMiller = new Employees(name, 50000);
        }

        // Prompt for hours worked by the new miller
        System.out.print("Enter the hours done by " + newMiller.getName() + ": ");
        int hoursWorked = scanner.nextInt();

        // Displaying the total pay for the new miller
        System.out.println("Total Pay for " + newMiller.getName() + " is: " + newMiller.biWeeklyPay(hoursWorked));
    }
}
