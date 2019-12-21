package com.aws.devops.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class EmployeeServiceImpl implements EmployeeServices {

	
	
	@Override
	public Employee create_services(Employee employee) {
		
		return null;
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
	public Employee getEmployee(Long employeeid) {
		
		return null;
	}

	@Override
	public void delete_service(Long employeeid) {
		// TODO Auto-generated method stub

	}

}
