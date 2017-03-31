package com.rjm.spring.rest.example.SpringRestExample.employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.jni.Time;

public class EmployeeSource {

	private static final Map<String, Employee> EMPLOYEES = new HashMap<String, Employee>();
    static {
        Employee emp1 = new Employee();
        emp1.setId("01");
        emp1.setName("Joe");
        emp1.setAge(32);
         
        Employee emp2 = new Employee();
        emp2.setId("02");
        emp2.setName("Sam");
        emp2.setAge(41);
         
        Employee emp3 = new Employee();
        emp3.setId("03");
        emp3.setName("Phil");
        emp3.setAge(22);
         
        EMPLOYEES.put(emp1.getId(), emp1);
        EMPLOYEES.put(emp2.getId(), emp2);
        EMPLOYEES.put(emp3.getId(), emp3);
    }
     
    public static Collection<Employee> getEmployees() {
        return EMPLOYEES.values();
    }
     
    public static Employee getEmployee(String empId) {
        return EMPLOYEES.get(empId);
    }
	
    public static boolean contains(String empId){
    	return EMPLOYEES.containsKey(empId);
    }
    
    public static void add(Employee employee){
    	employee.setId(String.valueOf(Time.now()));
    	EMPLOYEES.put(employee.getId(), employee);
    }
    
    public static void update(Employee employee){
    	EMPLOYEES.put(employee.getId(), employee);
    }
	
}
