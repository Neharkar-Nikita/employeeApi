package com.cogni.employee.services;

import java.util.List;

import com.cogni.employee.entity.Employee;

public interface EmployeeServices {

	Employee addEmployee(Employee empolyee);

	List<Employee> listEmployee();

	Employee fetchEmployeeById(Long employeeID);

	String deleteEmployee(Long employeeID);

	Employee editEmployee(Long employeeID, Employee empolyee);

}
