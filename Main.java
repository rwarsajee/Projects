package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import java.util.Date;


import java.io.IOException;

/**
 * 
 * Main class to execute the application, instantiates two employees and writes and saves the employee text
 * 
 */

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		

		// Instantiate two Employee objects and use PermanentEmployeeService.java 
		PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
        ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
        
		// and ContractEmployeeService.java to calculate and populate required data for objects
        Employee Employee = new Employee();
        

        
        permanentEmployee.setName("john");
        permanentEmployee.setEmail("abc@gmail.com");
        permanentEmployee.setAddress("123 abc");
        permanentEmployee.setSalary(50000);  // Set the base salary
        permanentEmployee.setNumberOfServiceYear(3);  
        permanentEmployee.calculateBonus(permanentEmployee);
        permanentEmployee.pensionContribution(permanentEmployee);
        permanentEmployee.calculateTotalCompensation(permanentEmployee);
      
        System.out.println(permanentEmployee.toString());
        
        contractEmployee.setName("Abby");
        contractEmployee.setEmail("def@gmail.com");
        contractEmployee.setAddress("456 def");
        contractEmployee.setSalary(30000);  // Set the base salary
        contractEmployee.setNumberOfServiceYear(0);
        contractEmployee.calculateBonus(contractEmployee);
        contractEmployee.renewalDate();
        contractEmployee.calculateTotalCompensation(contractEmployee);
        System.out.println(contractEmployee.toString());
   
        
        
		// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
    

        EmployeeSaver employeeSaver = new EmployeeSaver(new JSONFormatter());
        EmployeeSaver employeeSaver2 = new EmployeeSaver(new TextFormatter());

        

        // Save the employee in text format 
        
        employeeSaver.saveEmployee(permanentEmployee, "json_employee_data.txt");
        employeeSaver.saveEmployee(contractEmployee, "json_employee_data.txt");

        employeeSaver2.saveEmployee(permanentEmployee, "text_employee_data.txt");
        employeeSaver2.saveEmployee(contractEmployee, "text_employee_data.txt");
    
		// Do the same thing to output the data to the console instead of saving it to a file.
		
	}	

}
