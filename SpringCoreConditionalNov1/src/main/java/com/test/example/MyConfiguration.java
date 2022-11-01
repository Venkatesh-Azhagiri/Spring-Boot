package com.test.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfiguration {

	
	@Bean
	@Conditional(MyCondition.class)
	public SampleBean getSampleBean() {
		return new SampleBean();
	}
	
	MyConfiguration(){
		System.out.println("MyConfiguration Constructor:::::");
	}
	
	
}
