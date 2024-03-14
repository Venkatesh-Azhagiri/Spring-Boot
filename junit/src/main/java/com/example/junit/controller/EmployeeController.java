package com.example.junit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.junit.model.Employee;
import com.example.junit.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<>(employeeService.fetchAllEmployees(), HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Optional<Employee>> getEmployees(@PathVariable("id") Long id) {
		return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
	}

}
