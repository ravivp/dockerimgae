package com.aws.devops.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class EmployeeServiceImpl implements EmployeeServices {

	public Employee dao;
	
	EmployeeServiceImpl(){
		dao=new Employee(0, null, null);
	}
	
	@Override
	public Employee create_services(Employee employee) {
		
		return dao=new Employee(employee.getEmployeeid(),employee.getEmployeename(),employee.getDesignation());
	}

	@Override
	public Employee update_services(Employee employee) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		

		 List<Employee> emplist=new ArrayList<>();
			
			emplist.add(new Employee(1010, "arvi", "software") );
			emplist.add(new Employee(1011, "ashok", "testing") );
			emplist.add(new Employee(1012, "kumar", "hr") );
			emplist.add(new Employee(1013, "pavan", "admin") );
		
		return emplist;
	}

	@Override
	public Employee getEmployee(int employeeid) {
		
switch(employeeid) {
		
		case 1010:  dao=new Employee(1010, "arvi", "software");
	    break;
		case 1011:  dao= new Employee(1011, "ashok", "testing");
		break;
		case 1012:  dao= new Employee(1012, "kumar", "hr") ;
		break;
		case 1013:  dao= new Employee(1013, "pavan", "admin");
		break;
		default:
			
			break;
		
		}
		
		return dao;
	}

	@Override
	public String delete_service(int employeeid) {
		
		return "employee is deleted" ;

	}

	

}
