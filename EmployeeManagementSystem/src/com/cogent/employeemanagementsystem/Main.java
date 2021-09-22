package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		
		// can u write a switch case  to handle all options?
//		1. add
//		2. getEmp by id
//		3. delete
//		4. update assignment
//		5. getall
//		6. exit
		EmployeeService employeeService = new EmployeeService();
		
		Employee employee = new Employee("ab001", "abhi", "chivate", 123.0f, "PA");
		
		String result = employeeService.addEmployee(employee);
		
		System.out.println(result);
		
		Employee[] employees = employeeService.getEmployees();
		
		for (Employee employee2 : employees) {
			System.out.println(employee2);
		}
		
	}

}
