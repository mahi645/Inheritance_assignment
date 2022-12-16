package com.axis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway2")
public class GateWayController2 {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/info2")
	public ResponseEntity<String> gatewayInfo(){
		return ResponseEntity.ok("gate way-1 is available"+ port);
	}
	
}
