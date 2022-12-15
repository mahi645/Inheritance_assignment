package com.axis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class InsuranceClientApplication {
	@Lazy
	@Autowired
	private RestTemplate template;
	@Value("${insurance-provider.url}")
	private String url;
	@GetMapping("/message")
	public String messagge() {
		String message=template.getForObject(url,String.class);
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientApplication.class, args);
	}
	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

}
