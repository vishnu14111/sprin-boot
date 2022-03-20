package com.mindtree.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.app.controller.entity.Employee;
import com.mindtree.app.service.EmployeeService;

@RestController
public class ApplicationController {
	
	@Autowired
	EmployeeService empService;
	@GetMapping("/employees")
	public List<Employee> hello() {
		return empService.getAllEmployees();
	}
}
