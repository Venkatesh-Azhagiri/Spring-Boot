package com.example.junit.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.junit.model.Employee;

@Service
public class AddressService {
	
	public Stream<Employee> findAddressByCity(List<Employee> address, String zipcode) {
		return address.stream().filter(a->a.equals(zipcode));
	}

}
