package com.algonquin.cst8288.assignment1.controller;

import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;

/**
 * Saves employee data to files using formatters. Abstracts the persistence logic.
 */

public class EmployeeSaver {
	private final Formatter employeeFormatter;

    public EmployeeSaver(Formatter employeeFormatter) {
        this.employeeFormatter = employeeFormatter;
    }
    
    public void saveEmployee(Employee employee, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename,true))) {
            writer.println(employeeFormatter.format(employee));
            writer.flush();
        }
    }
	

}
