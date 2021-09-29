package com.cogent.employeemanagementsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("ab001", "abhi", "chivate", 123.00f);
		employee.setEmpSalary(-5000.0f);
//		
//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//			fileOutputStream.write("abc".getBytes());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	
//	public static int division(int a, int b) {
//		
//		int c = 0;
//		try {
//			c = a / b; // it will create an object of arithmetic exception.
//			// JVM will implicitly create the objects for all pre defined runtime exceptions.
//			
//			return c ; // if division is done then return the result.
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//		
//		}
//		
////		finally {
////			System.out.println("inside the finally block"); // finally block code 
////			
////		}
//		
//		return -1;
//		
//	}
//	
//
//	public static void main(String[] args) {
//		
//		try { // 10 statements 
//			System.out.println(10/5);
//			String s = null;
//			System.out.println(s.concat("abhi")); // s is holding that means 
//			// s is not refering to object 
//			// to call concat method we need object
//			// since object is not there and we are trying to call concat method 
//			// then it will throw NPE.
//			
//		} // extreme child to top parent.
//		
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//		}
//		catch (RuntimeException e) {
//			// TODO: handle exception
//		}
//		
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("exception caught");
//			System.out.println(e.getClass().getName());
//		}
//		catch (Throwable e) {
//			// TODO: handle exception
//		}
//		// Why no for object if object is able to handle it then everyclass is capable to 
//		// handle the exception 
//		// then what is diff between a normal class and exceptional class?
//		
////		catch (Object e) {
////			// TODO: handle exception
////		}
//		
//		
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	