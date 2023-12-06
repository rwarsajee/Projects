/**
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
 * @purpose Employees Class
 */





package polymorphism;

/**
 * This class represents the employee. An employee is paid the same amount regardless of the hours the employee worked.
 */
// TO DO: TASK 1 - DECLARE YOUR CLASS AND ANY VARIABLES HERE.
public class Employees extends Millers {
	
    // TO DO: TASK - Declare any variables needed for this class.
    private double annualPay;

    /**
     * Constructs an employee with a given name and an annual pay.
     *
     * @param name the name of this employee
     * @param pay the annual pay of the employee
     */
    public Employees(String name, double pay) {
        setName(name);
        annualPay = pay;
    }

    // TO DO: TASK - This portion of your code computes the pay for this category of miller.

    // YOUR CODE GOES IN HERE.
    /**
     * Computes the biweekly pay for this employee.
     *
     * @param hoursWorked the number of hours worked biweekly
     * @return the biweekly pay for the employee
     */
    @Override
    public double biWeeklyPay(int hoursWorked) {
        return annualPay / 26; // Assuming there are 26 biweekly periods in a year
    }
}
