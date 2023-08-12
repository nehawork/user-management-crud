package com.learn.usermanagement.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String SayHelloWorld() {
		return "Hello World";
	}
}
