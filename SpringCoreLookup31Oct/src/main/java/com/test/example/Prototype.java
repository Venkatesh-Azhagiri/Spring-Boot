package com.test.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
	
	
	public String getValueFromPrototype() {
		return  "Prototype"+String.valueOf(this.hashCode());
	}

}
