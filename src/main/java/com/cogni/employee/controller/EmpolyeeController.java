package com.cogni.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogni.employee.entity.Employee;
import com.cogni.employee.services.EmployeeServices;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class EmpolyeeController {
	
	@Autowired
	private EmployeeServices employeeServies;
	@CrossOrigin
	@PostMapping("/empolyee")
	public  Employee addEmployee(@RequestBody Employee empolyee) {
		
		return employeeServies.addEmployee(empolyee);
				
	}
	@CrossOrigin       
	@GetMapping("/empolyee")
   public List<Employee> listEmployee() {
		return employeeServies.listEmployee();
				
	}
	@CrossOrigin
	@GetMapping("/empolyee/{id}")
	   public Employee fetchEmployeeById(@PathVariable("id")Long employeeID) {
			return employeeServies.fetchEmployeeById(employeeID);
					
		}
	
	@DeleteMapping("/empolyee/{id}")
	 public String deleteEmployee(@PathVariable("id")Long employeeID) {
			return employeeServies.deleteEmployee(employeeID);
					
		}
	
	@PutMapping("/empolyee/{id}")
	 public Employee editEmployee(@PathVariable("id")Long employeeID,@RequestBody Employee empolyee) {
			return employeeServies.editEmployee(employeeID,empolyee);
					
		}
  
}
