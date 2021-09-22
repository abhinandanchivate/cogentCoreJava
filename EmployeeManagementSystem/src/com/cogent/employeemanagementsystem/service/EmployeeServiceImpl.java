package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl {
	
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	// are we consuming the repo?
	
	// loose coupling : 

	public String addEmployee(Employee employee) {
		
		return employeeRepository.addEmployee(employee);
		
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}
}
