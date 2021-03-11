package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String index() {
		System.out.println("helloj");
		return "Hello World";
		//return "<h1>Hello World</h1>";
		
	}
	
	
}
