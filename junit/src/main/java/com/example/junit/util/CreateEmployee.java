package com.example.junit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.example.junit.model.*;

public class CreateEmployee {

	public static List<Employee> buildEmployeeData() {
		List<Employee> employees = new ArrayList<>();

		employees.add(createEmployee("Alice Johnson", 101L, 70000.00, "Software Developer",
				Arrays.asList("Java", "Spring", "Microservices"), "123 Maple Street", "Techville", "TechState",
				"12345"));
		employees.add(createEmployee("Bob Smith", 102L, 80000.00, "UI/UX Designer",
				Arrays.asList("Sketch", "Figma", "Photoshop"), "456 Oak Lane", "DesignCity", "CreativeState", "23456"));
		employees.add(createEmployee("Charlie Brown", 103L, 75000.00, "Database Administrator",
				Arrays.asList("SQL", "PostgreSQL", "Performance Tuning"), "789 Pine Road", "DataTown", "DataBaseState",
				"34567"));
		employees.add(createEmployee("Diana Prince", 104L, 68000.00, "Quality Assurance",
				Arrays.asList("Selenium", "Cucumber", "Test Automation"), "321 Birch Avenue", "QualityVille",
				"TestState", "45678"));
		employees.add(createEmployee("Ethan Hunt", 105L, 72000.00, "Security Analyst",
				Arrays.asList("Penetration Testing", "Cybersecurity", "Risk Assessment"), "654 Cedar Blvd",
				"SecureCity", "SafeState", "56789"));
		employees.add(createEmployee("Fiona Gallagher", 106L, 65000.00, "Project Manager",
				Arrays.asList("Agile", "Scrum", "Project Planning"), "987 Walnut Street", "ManageTown", "LeadState",
				"67890"));
		employees.add(createEmployee("George Lucas", 107L, 78000.00, "Creative Director",
				Arrays.asList("Storytelling", "Branding", "Art Direction"), "213 Elm Street", "CreativeCity",
				"InnovateState", "78901"));
		employees.add(createEmployee("Hannah Abbott", 108L, 66000.00, "Human Resources",
				Arrays.asList("Recruiting", "Employee Relations", "Benefits Administration"), "532 Fir Lane",
				"PeopleCity", "HRState", "89012"));
		employees.add(createEmployee("Ian Malcolm", 109L, 83000.00, "Data Scientist",
				Arrays.asList("Machine Learning", "Data Analysis", "Python"), "365 Spruce Path", "DataVille",
				"AnalyticsState", "90123"));
		employees.add(createEmployee("Jane Foster", 110L, 77000.00, "Physicist",
				Arrays.asList("Quantum Mechanics", "Research", "Data Modeling"), "258 Ash Road", "ScienceCity",
				"PhysicsState", "01234"));

		employees.forEach(e -> System.out.println(e));

		return employees;
	}

	private static Employee createEmployee(String name, Long id, double salary, String role, List<String> skills,
			String street, String city, String state, String zipCode) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setId(id);
		employee.setSalary(salary);
		employee.setRole(role);
		employee.setSkills(skills);
		employee.setDateOfBirth(new Date());
		employee.setActive(true);
		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zipCode);
		employee.setAddress(address);
		return employee;
	}

}
