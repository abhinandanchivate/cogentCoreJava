package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeService {
	
	
	public String addEmployee(Employee employee );
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id);
	public Employee[] getEmployees();
	public Employee[] getEmployeesByName(String name);
	public String updateEmployee(String id, Employee employee);

}
