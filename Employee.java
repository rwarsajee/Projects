 package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * Represents an employee with attributes like name, email, address, salary, and more.
 */

public class Employee {

	private String name;
	private String email;
	private String address;
	private double salary;
	private int numberOfServiceYear;
	protected double bonus;
	protected double pensionContribution;
	protected double totalCompensation;
	protected Date renewalDate;

	public Employee() {
		// Default constructor
	}

	
	
	// Getters and Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}

	public void setNumberOfServiceYear(int numberOfServiceYear) {
		this.numberOfServiceYear = numberOfServiceYear;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTotalCompensation() {
		return totalCompensation;
	}

	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	
	public double getpensionContribution() {
		return pensionContribution;
	}
	
	public void setpensionContribution(double pensionContribution) {
		this.pensionContribution = pensionContribution;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
				+ ", numberOfServiceYear=" + numberOfServiceYear + ", bonus=" + bonus + ", totalCompensation="
				+ totalCompensation + ", pensionContribution="+ pensionContribution+ ", renewalDate=" + renewalDate + "]";
	}

	public Date renewalDate() {
		// TODO Auto-generated method stub
		return null;
	}

}