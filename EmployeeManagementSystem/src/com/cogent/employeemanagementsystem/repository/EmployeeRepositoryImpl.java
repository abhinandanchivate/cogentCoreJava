package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepository employeeRepository;
	
	private EmployeeRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static EmployeeRepository getInstance() {
		
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
		
	}
	static int counter = 0;
	public String addEmployee(Employee employee) {
		
		// do we need to maintain the index for an employees array ?
		
		if(counter>=employees.length) {
		
			return "array is full";
		}
		
		employees[counter++] = employee;
		return "success";
		
		
		
	}
	
	// this method should give us employee details on the basis of id
	public Employee getEmployeeById(String id) {
		
		for (Employee employee : employees) {
			
			if(employee!=null && id.equals(employee.getEmployeeId())  ) {
				return employee;
			}
		}
		return null;
		
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	public String deleteEmployeeById(String id) {
		
		// 1 that id exists or not.
		Employee employee = this.getEmployeeById(id);
		
		if(employee!=null) {
			// record found
			// we need to set null
			
		}
		else {
			return "not found";
		}
		// 2. id exists then set null to location? 
		// if return notfound
		return id;
	}
	
	private int getIndex(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			
			if(employees[i].equals(employee)) {
				return i;
			}
		}
		return -1;
		
		
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
