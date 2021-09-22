package com.cogent.employeemanagementsystem.model;


public class Manager extends Employee {
	
	private String managerId;
	private float projectAllow;
	
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary();
	}
	public Manager() {
		this("","","",1000.0f,1000.0f,"");
		// to another constructor from the same class.
		
	}
	
	public Manager(String empId, String firstName, String lastName, 
			float empSalary, float projectAllow,
			String managerId) {
		super(empId,firstName,lastName, empSalary);// it will give a call to constructor from parent class
		
		this.projectAllow = projectAllow;
		this.managerId = "manager";
		
		
	}
	
	

}
