package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

public interface ContractEmployeeService extends EmployeeService {
    Date renewalDate();
    public double calculateBonus(Employee employee);
}
