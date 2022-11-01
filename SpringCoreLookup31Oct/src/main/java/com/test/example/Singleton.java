package com.test.example;

import org.springframework.stereotype.Component;

@Component	
public class Singleton {
	
	public String getValueFromSingleton() {
		return "Singleton"+String.valueOf(this.hashCode());
	}

}
