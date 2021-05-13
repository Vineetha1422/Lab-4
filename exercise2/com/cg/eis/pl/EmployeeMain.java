package com.cg.eis.pl;

import com.cg.eis.service.EmployeeServicesImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServicesImpl s = new EmployeeServicesImpl();
		s.setEmpId(101);
		s.setEmpName("abc");
		s.setSalary(75000);
		s.setDesignation("Software Engineer");
		
		s.displayDetails();
		s.findInsScheme(s.getSalary());
	}

}