package com.mindtree.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.app.controller.entity.Employee;

import com.mindtree.app.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
}
