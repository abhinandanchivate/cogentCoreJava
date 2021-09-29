package com.cogent.employeemanagementsystem.service;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryALImpl;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl {
	
	EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
	// are we consuming the repo?
	
	// loose coupling : 

	public String addEmployee(Employee employee) {
		
		return employeeRepository.addEmployee(employee);
		
	}
	
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}
}
