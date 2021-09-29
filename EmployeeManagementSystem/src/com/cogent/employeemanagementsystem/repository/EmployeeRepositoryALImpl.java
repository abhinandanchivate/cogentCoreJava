package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

	private Set<Employee> employees = new HashSet<>();
	
	// 16 employees 
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
		Employee employee = this.getEmployeeById(id);
		
		if(employee!=null) {
			boolean status = employees.remove(employee);
			if(status) {
				return "success";
			}
			
		}
		return "notFound";
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
		// delete all employees from AL.
		employees.clear();

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
		// set ===> list.
		return new ArrayList<>(employees);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if(id.equals(employee.getEmployeeId())) {
				return true;
			}
		}
		return false;
	}

}
