package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	
	// Singleton DP.
private static EmployeeRepository employeeRepository;
	
	private EmployeeRepositoryALImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static EmployeeRepository getInstance() {
		
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryALImpl();
			return employeeRepository;
		}
		return employeeRepository;
		
	}

	private List<Employee> employees = new ArrayList<>();
	// 10 employees 
	// when we will add 11th one then it will increase the size automatically.
	// self growable.
	
	// <Employee>  ====> we are informing that we will hold only Employee type objects.
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		boolean status = employees.add(employee);
		
		if(status)
			
		return "success";
		else 
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		// 1. we need to traverse the arraylist.
		
		for (Employee employee : employees) {
			if(id.equals(employee.getEmployeeId()))
				return employee;
			//System.out.println(employee);
		}
		// 2. we need to use java 8 features.
		
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		// AL => array 
		//Employee employee[] = new Employee[employees.size()];
		return employees;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
