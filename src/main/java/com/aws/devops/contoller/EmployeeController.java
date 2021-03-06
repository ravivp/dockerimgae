package com.aws.devops.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeservices;
	
	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee) {
		
		return employeeservices.create_services(employee);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		
		return employeeservices.update_services(employee);
	}
	
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		
	 return	employeeservices.getAllEmployee();	
	 
	}
	
          // aadded new commant line
	@GetMapping("/by/{employeeid}")
	public  Employee getemployee(@PathVariable(name = "employeeid") int employeeid) {
		
		return employeeservices.getEmployee(employeeid);
		
	}
	
	@DeleteMapping("/delete/{employeeid}")
	public void delete(@PathVariable(name = "employeeid") int employeeid ) {
		
		employeeservices.delete_service(employeeid);
		
	}
	
	
}

