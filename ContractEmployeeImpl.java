package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * Represents a contract employee and extends the Employee class.
 * Implements the ContractEmployeeService interface with methods for calculating
 * total compensation, renewal date, and bonus.
 */
public class ContractEmployeeImpl extends Employee implements ContractEmployeeService {
    
    /**
     * Calculates the total compensation for a contract employee.
     *
     * @param employee The contract employee object.
     * @return The total compensation (0.0 for contract employees).
     */
    @Override
    public double calculateTotalCompensation(Employee employee) {
        return totalCompensation = 0.0;
    }

    /**
     * Calculates the renewal date for a contract employee.
     *
     * @return The renewal date (1 year from today).
     */
    public Date renewalDate() {
        // Calculate renewal date logic (1 year from today)
        return renewalDate = new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000);
    }

    /**
     * Calculates the bonus for a contract employee.
     *
     * @param employee The contract employee object.
     * @return The bonus (0.0 for contract employees).
     */
    @Override
    public double calculateBonus(Employee employee) {
        return bonus = 0.0;
    }
}