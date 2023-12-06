/* Rashid Warsajee
 * Lab Exercise 05
 * Harleen Kaur
 * Due August 4th 2023
 * User class
 */



import java.util.Scanner;

class User {
    private Scanner scan;

    public User() {
        scan = new Scanner(System.in);     // our scanner instantiation 
    }

    // ask user for an integer input
    public int inputInteger(String prompt) {
        System.out.print(prompt);
        return scan.nextInt();
    }
    
    // ask user for a double input
    public double inputDouble(String prompt) {
        System.out.print(prompt);
        return scan.nextDouble();
    }
    
    // Prompt the user for a string input 
    public String inputString(String prompt) {
        System.out.print(prompt);
        scan.nextLine(); // newline
        return scan.nextLine();
    }
    
    // ask user for an integer input within min to max 
    public int inputInteger(String prompt, int min, int max) {
        int value;
        do {
            value = inputInteger(prompt);
        } while (value < min || value > max);
        return value;
    }
}