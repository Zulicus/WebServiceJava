package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller - Program needs this to know what to do
@RestController
public class Give_me_Rev {

	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		System.out.println("hello");
		return "Hello World";
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "/torev")
	public String makeRev(String rev) {
		StringBuilder sb = new StringBuilder(rev);
		
		return sb.reverse().toString();
		
	}
	
	
	
	
}
