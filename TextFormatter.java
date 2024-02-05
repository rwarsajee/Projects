package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 * Formats employee data as key-value pairs in text format.
 */

import java.io.IOException;

/**
 * Formats employee data as key-value pairs in text format.
 */
public class TextFormatter implements Formatter {
    
    /**
     * Formats the provided Employee object as a string in key-value pairs.
     *
     * @param employee The Employee object to be formatted.
     * @return A formatted string containing employee data in key-value pairs.
     * @throws IOException If an I/O error occurs while formatting the data.
     */
    @Override
    public String format(Employee employee) throws IOException {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        StringBuilder formattedText = new StringBuilder();
        formattedText.append("name=").append(employee.getName()).append(", ")
                     .append("email=").append(employee.getEmail()).append(", ")
                     .append("address=").append(employee.getAddress()).append(", ")
                     .append("salary=").append(employee.getSalary()).append(", ")
                     .append("numberOfServiceYear=").append(employee.getNumberOfServiceYear()).append(", ")
                     .append("bonus=").append(employee.getBonus()).append(", ")
                     .append("pensionContribution=").append(employee.getpensionContribution()).append(", ")
                     .append("totalCompensation=").append(employee.getTotalCompensation()).append(", ")
                     .append("renewalDate=").append(employee.getRenewalDate());

        return formattedText.toString();
    }
}
