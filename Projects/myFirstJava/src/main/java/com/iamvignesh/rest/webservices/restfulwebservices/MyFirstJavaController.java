package com.iamvignesh.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstJavaController {

	@GetMapping(path = "/")
	public String myfirstjava() {
		return "{\"message\":\"My First Java using Docker v1\"}";
	}
}
