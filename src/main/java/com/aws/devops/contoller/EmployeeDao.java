package com.aws.devops.contoller;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	
	
	public List<Employee> all() {
		
		 List<Employee> emplist=new ArrayList<>();
			
			emplist.add(new Employee(1010, "arvi", "software") );
			emplist.add(new Employee(1011, "ashok", "testing") );
			emplist.add(new Employee(1012, "kumar", "hr") );
			emplist.add(new Employee(1013, "pavan", "admin") );
		
		return emplist;
		
	}
	
	public Employee employee(int employeeid) {
		
		/*
		 * List<Employee> emplist=new ArrayList<>(); emplist.add(new Employee(1010,
		 * "arvi", "software") ); emplist.add(new Employee(1011, "ashok", "testing") );
		 * emplist.add(new Employee(1012, "kumar", "hr") ); emplist.add(new
		 * Employee(1013, "pavan","admin") );
		 * 
		 * 
		 * boolean flag=false; for(Employee emplist1:emplist) {
		 * 
		 * int empid=emplist1.getEmployeeid(); if(empid==id) {
		 * 
		 * return new Employee(emplist1.getEmployeeid(),emplist1.getEmployeename(),
		 * emplist1.getDesignation()); flag=true; }
		 * 
		 * break; }
		 */
		
		
		Employee emp = new Employee(employeeid, null, null);
		switch(employeeid) {
		
		case 1010:  emp=new Employee(1010, "arvi", "software");
	    break;
		case 1011:  emp= new Employee(1011, "ashok", "testing");
		break;
		case 1012:  emp= new Employee(1012, "kumar", "hr") ;
		break;
		case 1013:  emp= new Employee(1013, "pavan", "admin");
		break;
		default:
			
			break;
		
		}
		
		return emp;
	} 
}
