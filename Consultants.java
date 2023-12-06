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
 * @purpose Consultants class 
 */



package polymorphism;

/**
 * This class represents the Consultant miller category.
 * A Consultant is a miller who is paid for every hour worked.
 */
public class Consultants extends Millers {

    private double consultantWage;

    /**
     * Constructs an hourly paid consultant with a given name and consultant wage.
     *
     * @param name           the name of this consultant
     * @param consultantWage the consultant wage per hour
     */
    public Consultants(String name, double consultantWage) {
        setName(name); // Use the setName method from the superclass to set the name
        this.consultantWage = consultantWage;
    }

    /**
     * Computes the bi-weekly pay for a Consultant miller.
     *
     * @param hoursWorked the number of hours worked bi-weekly
     * @return the total pay for the given number of hours, including overtime if applicable
     */
    @Override
    public double biWeeklyPay(int hoursWorked) {
        double pay = hoursWorked * consultantWage;

        // In this part of the code, an overtime amount is added if the Consultant works for more than 76 hours bi-weekly.
        if (hoursWorked > 76) {
            pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
        }

        return pay;
    }
}
