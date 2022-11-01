package com.test.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConditonalController {
	
	@Autowired(required=false)
	SampleBean sampleBean;
	
	@GetMapping("/config")
	public String getConfigurationAnnotation() {
		return sampleBean.printSampleBean();
	}
	
	

}
