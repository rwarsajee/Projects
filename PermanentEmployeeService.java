package com.algonquin.cst8288.assignment1.emoloyee;


// interface defines a contract for services related to permanent employees

public interface PermanentEmployeeService extends EmployeeService {
    double pensionContribution(Employee employee);
    double calculateBonus(Employee employee);
}
