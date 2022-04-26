package com.cogni.employee.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogni.employee.entity.Employee;
import com.cogni.employee.repo.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository empolyeeRespository;
	@Override
	public Employee addEmployee(Employee empolyee) {
	
		return empolyeeRespository.save(empolyee) ;
	}
	@Override
	public List<Employee> listEmployee() {
		
		return empolyeeRespository.findAll();
	}
	@Override
	public Employee fetchEmployeeById(Long employeeID) {
		
		return empolyeeRespository.findById(employeeID).get() ;
	}
	@Override
	public String deleteEmployee(Long employeeID) {
		Employee e= empolyeeRespository.findById(employeeID).get();
		 empolyeeRespository.delete(e);
		 return "Employee Record Deleted";
	}
	@Override
	public Employee editEmployee(Long employeeID, Employee empolyee) {
		
		Employee e= empolyeeRespository.findById(employeeID).get();
		if(Objects.nonNull(empolyee.getEmployeeFirstName())&& !"".equals(empolyee.getEmployeeFirstName())) {
			e.setEmployeeFirstName(empolyee.getEmployeeFirstName());
		}
		if(Objects.nonNull(empolyee.getEmployeeLastName())&& !"".equals(empolyee.getEmployeeLastName())) {
			e.setEmployeeLastName(empolyee.getEmployeeLastName());
		}
		if(Objects.nonNull(empolyee.getEmployeeEmail())&& !"".equals(empolyee.getEmployeeEmail())) {
			e.setEmployeeEmail(empolyee.getEmployeeEmail());
		}
		if(Objects.nonNull(empolyee.getEmployeePhone())&& !"".equals(empolyee.getEmployeePhone())) {
			e.setEmployeePhone(empolyee.getEmployeePhone());
		}
		if(Objects.nonNull(empolyee.getEmployeeLocation())&& !"".equals(empolyee.getEmployeeLocation())) {
			e.setEmployeeLocation(empolyee.getEmployeeLocation());
		}
		return empolyeeRespository.save(e);
	}

}
