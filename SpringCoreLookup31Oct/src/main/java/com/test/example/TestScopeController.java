package com.test.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestScopeController {
	@Autowired
	Singleton singleton;
	
	@Autowired
	Prototype prototype;
	
	@GetMapping("/test")
	public String getScope() {
		return singleton.getValueFromSingleton()+"----"+getPrototypeBean().getValueFromPrototype();
	}
	
	@Lookup
	public Prototype getPrototypeBean() {
		return null;
	}


}
