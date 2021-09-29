package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main2 {

	public static void main(String[] args) {

		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		
	String result = null;
	try {
		result = employeeService.addEmployee(new Employee("ab001", "abhi", "chivate", 1234.0f));
	} catch (InvalidSalaryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	if("success".equals(result)) {
		System.out.println("employee added successfully");
	}
		
	

	}
}
