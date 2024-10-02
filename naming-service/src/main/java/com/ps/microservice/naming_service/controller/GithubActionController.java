package com.ps.microservice.naming_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubActionController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello World";
		
	}

}
