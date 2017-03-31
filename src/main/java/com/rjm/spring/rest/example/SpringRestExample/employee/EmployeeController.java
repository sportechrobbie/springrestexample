package com.rjm.spring.rest.example.SpringRestExample.employee;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Collection<Employee> getEmployees(){
		return EmployeeSource.getEmployees();
	}
	
	@RequestMapping(value="/{empId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable String empId){
		return EmployeeSource.getEmployee(empId);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) throws Exception{
		
		if(EmployeeSource.contains(employee.getId())){
			EmployeeSource.update(employee);
		}else{
			throw new Exception("Employee "+ employee.getId()+" does not exists");
		}
		return employee;		
	}
}
