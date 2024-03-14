package com.example.junit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.junit.model.Address;
import com.example.junit.model.Employee;
import com.example.junit.util.CreateEmployee;

@ExtendWith(MockitoExtension.class)
public class CreateEmployeeTest {

	@Test
	public void testStaticMethod() {
		Employee emp = createEmployee("Test Alice Johnson", 101L, 70000.00, "Test Software Developer",
				Arrays.asList("Java", "Spring", "Microservices"), "123 Maple Street", "Techville", "TechState",
				"12345");
		MockedStatic<CreateEmployee> mockedStatic = mockStatic(CreateEmployee.class);
		mockedStatic.when(CreateEmployee::buildEmployeeData).thenReturn(Arrays.asList(emp));
		List<Employee> result = CreateEmployee.buildEmployeeData();

		assertEquals(result.get(0).getName().equals("Test Alice Johnson"), true);
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
