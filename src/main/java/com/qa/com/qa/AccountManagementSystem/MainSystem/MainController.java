package com.qa.com.qa.AccountManagementSystem.MainSystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@RequestMapping(value ="/")
	public String home() {
		return "Hello Wordddld!22";
	}
	
	

}
