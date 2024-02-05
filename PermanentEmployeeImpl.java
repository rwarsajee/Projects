package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * Represents a permanent employee and implements various services related to them.
 */

public class PermanentEmployeeImpl extends Employee implements EmployeeService{
	@Override
    public double calculateTotalCompensation(Employee employee) {
        return totalCompensation= employee.getSalary() + calculateBonus(employee);
    }

    
    public double pensionContribution(PermanentEmployeeImpl employee) {
        return  pensionContribution=0.01* employee.getSalary();
    }

    
    public double calculateBonus(Employee employee) {
        return bonus=0.025 * employee.getSalary() * employee.getNumberOfServiceYear();
    }
    
   
    

}
