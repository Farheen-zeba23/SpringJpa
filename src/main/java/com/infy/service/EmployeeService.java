package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Department;
import com.infy.dto.Employee;
import com.infy.dto.EmployeeDTO;
import com.infy.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
	public boolean addEmployee(EmployeeDTO dto) {
		Department dept=new Department();
		dept.setDepartmentId(dto.getDepartment().getDepartmentId());
		dept.setDepartmentName(dto.getDepartment().getDepartmentName());
		Employee e=new Employee();
		e.setEmpId(dto.getEmpId());
		e.setEmpName(dto.getEmpName());
		e.setEmpSal(dto.getEmpsal());
		e.setDepartment(dept);
		repo.save(e);
		
		return true;
		
	}

}
