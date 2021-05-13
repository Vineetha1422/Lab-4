package com.cg.eis.bean;

public class Employee {

	private int EmpId;
	private String EmpName;
	private double Salary;
	private String Designation;
	private String InsuranceScheme;
	
	public Employee() {
		super();
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getInsuranceScheme() {
		return InsuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		InsuranceScheme = insuranceScheme;
	}
	
}