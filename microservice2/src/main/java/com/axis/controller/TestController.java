package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.feignclient.ProductClient;
import com.axis.model.Product;

@RestController
@RequestMapping("/testapi/v1")
public class TestController {

	@Autowired
	ProductClient productClient;
	
	@GetMapping("/greet")
	public String greet()
	{
		return "welocme to microservice 2";
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return productClient.getAllProduct();
	}
}
