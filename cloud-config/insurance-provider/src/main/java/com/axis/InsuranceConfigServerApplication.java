package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@RequestMapping("/api")
public class InsuranceConfigServerApplication {
	@GetMapping("/greet")
	public String greet() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigServerApplication.class, args);
	}

}
