package com.cogent.employeemanagementsystem.model;

import java.util.Objects;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//@Data
//@AllArgsConstructor
@ToString
public class Employee {

	@Override
	public int hashCode() {
		return Objects.hash(address, empSalary, employeeId, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address)
				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	public float calculateSalary() {
		return empSalary + 500;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) throws InvalidSalaryException {
		// salary is not negative RT
		// if it is negative invalidsalaryException
		if (empSalary > 0)
			this.empSalary = empSalary;
		else
			throw new InvalidSalaryException("salary should not be negative");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(String employeeId, String firstName, String lastName, float empSalary)
			throws InvalidSalaryException {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setEmpSalary(empSalary);
	}

	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;

	public Employee() {
		this.employeeId = "";
		System.out.println("hello from employee default constructor");
		// explicit default constructor

	}
	/*
	 * public Employee(String employeeId, String firstName, String lastName, float
	 * empSalary) { super(); this.employeeId = employeeId; this.firstName =
	 * firstName; this.lastName = lastName; this.empSalary = empSalary; }
	 */

}
