package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServicesImpl extends Employee implements EmployeeService  {

	public void findInsScheme(double salary) {
		if(salary > 100000 ) {
			System.out.println("Policy1");
		}else if(salary >= 50000 && salary < 99000) {
			System.out.println("Policy2");
		}else {
			System.out.println("Policy3");
		}
		
		
	}


	public void displayDetails() {
		System.out.println("Employee Id: "+getEmpId());
		System.out.println("Employee Name: "+getEmpName());
		System.out.println("Employee Salary: "+getSalary());
		System.out.println("Employee Deignation: "+getDesignation());
		
		
	}
}
