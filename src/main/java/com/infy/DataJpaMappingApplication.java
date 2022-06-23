package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.dto.DepartmentDTO;
import com.infy.dto.Employee;
import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeService;

@SpringBootApplication
public class DataJpaMappingApplication implements CommandLineRunner {
	@Autowired
	EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(DataJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		addEmployee();
	}

	public  void addEmployee() {
	
		DepartmentDTO deptdto=new DepartmentDTO(100,"Sales");
		EmployeeDTO empdto=new EmployeeDTO(1,"Zeba",50000, deptdto);
		service.addEmployee(empdto);
		
	}

}
