package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

/**
 * Processes employee data, calculates bonuses, total compensation, and more.
 */

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;

public class EmployeeProcessor extends Rate {
	private final EmployeeValidator employeeValidator;
    private final EmployeeSaver employeeSaver;

    public EmployeeProcessor(EmployeeValidator employeeValidator, EmployeeSaver employeeSaver) {
        this.employeeValidator = employeeValidator;
        this.employeeSaver = employeeSaver;
    }
    
    
    public String processEmployee(Employee employee, Formatter formatter, String filename) throws IOException {
        // Process data
        calculateBonus(employee);
        calculateTotalCompensation(employee);
        calculatePensionContribution(employee);
        calculateRenewalDate(employee);

        // Validate data
        if (!employeeValidator.isValidEmployee(employee)) {
            return "FAILED";
        }

        
		// Store data using the provided formatter
        employeeSaver.saveEmployee(employee,filename);
        return "SUCCESS";
    }
    

		
		public void calculateBonus(Employee employee) {
		    // Calculate bonus based on business logic
		    // Bonus could be, for example, 2.5% of the salary multiplied by years of service
		    double bonus = BONUS_PERCENTAGE * employee.getSalary() * employee.getNumberOfServiceYear();
		    employee.setBonus(bonus);
		}

		public void calculateTotalCompensation(Employee employee) {
		    // Calculate total compensation based on business logic
		    // Total compensation could be the sum of salary and bonus
		    double totalCompensation = employee.getSalary() + employee.getBonus();
		    employee.setTotalCompensation(totalCompensation);
		}

		public void calculatePensionContribution(Employee employee) {
		    // Calculate pension contribution based on business logic
		    // Pension contribution could be, for example, 1% of the salary
		    double pensionContribution = PENSION_PERCENTAGE * employee.getSalary();
		    employee.setTotalCompensation(pensionContribution);
		}

		public void calculateRenewalDate(Employee employee) {
		    // Calculate renewal date based on business logic
		    // Renewal date might be specific to contract employees
		    // For example, renewal date is 1 year from today
		    // For permanent employees, this method can be left empty or not implemented
		    // based on the requirements
		    
		}
}
