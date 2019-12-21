package com.aws.devops.contoller;





public class Employee {

	
	private int employeeid;
	


	private String employeename;
	
	
	public Employee(int employeeid, String employeename, String designation) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.designation = designation;
	}

	

	private String designation;

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}

