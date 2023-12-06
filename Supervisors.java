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
 * @purpose Supervisor class
 */




package polymorphism;

/**
 * This class represents the Supervisors miller category.
 * Supervisors are part of the Employees category and receive an additional bonus bi-weekly.
 */
public class Supervisors extends Employees {

    private double bonus;

    /**
     * Constructs a Supervisor miller with a given name, annual pay, and bonus.
     *
     * @param name      the name of this supervisor
     * @param annualPay the annual pay of the supervisor
     * @param bonus     the bonus amount for the supervisor
     */
    public Supervisors(String name, double annualPay, double bonus) {
        super(name, annualPay);
        this.bonus = bonus;
    }

    /**
     * Computes the bi-weekly pay for a Supervisor miller.
     * Supervisor's bi-weekly pay includes the bonus.
     *
     * @param hoursWorked the number of hours worked bi-weekly 
     * @return the total bi-weekly pay for the supervisor + the bonus
     */
    @Override
    public double biWeeklyPay(int hoursWorked) {
        // Supervisor's bi-weekly pay includes the bonus
        return super.biWeeklyPay(hoursWorked) + bonus / 26;
    }
}
