package com.aws.devops.contoller;

import java.util.List;


public interface EmployeeServices {

	
	Employee create_services(Employee employee);
	
	Employee update_services(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployee(Long employeeid);
	
	void delete_service(Long employeeid);
}