package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;

/**
 * 
 * Process, validate and save employee data.
 * refactored to focus on coordinating and delegating 
 * responsibilities rather than implementing those responsibilities itself
 * 
 * 
 */

public class EmployeeController {

	private final EmployeeProcessor employeeProcessor;

    public EmployeeController(EmployeeProcessor employeeProcessor) {
        this.employeeProcessor = employeeProcessor;
    }

    public String processEmployee(Employee employee, Formatter formatter, String filename) throws IOException {
        return employeeProcessor.processEmployee(employee, formatter, filename);
    }

}