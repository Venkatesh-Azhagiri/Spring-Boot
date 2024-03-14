package com.example.junit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junit.model.Employee;
import com.example.junit.util.CreateEmployee;

import jakarta.annotation.PostConstruct;

@Service
public class EmployeeService {
	
	@Autowired
	AddressService addressService;
	
	private List<Employee> employees = new ArrayList<>();
	
	@PostConstruct
	public void init(){
		employees = CreateEmployee.buildEmployeeData();
	}
	
	public List<Employee> fetchAllEmployees(){
		return employees;
		
	}
	
	public Optional<Employee> getEmployee(Long id) {
		return   employees.stream().filter(e->e.getId().equals(id)).findFirst();
	}

}
