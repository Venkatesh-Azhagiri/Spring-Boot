package com.example.junit.service;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
	
	@InjectMocks
	EmployeeService empService;
	
	
	@DisplayName("getEmployee")
	@Test
	public void testGetAllEmployees() {
		assertNotNull(empService.getEmployee(101L));
	}

}
