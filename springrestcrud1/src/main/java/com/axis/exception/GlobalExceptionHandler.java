package com.axis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(IDNotFoundException.class)
	public ResponseEntity<String> noIdFound(IDNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.NOT_FOUND);
	}
	
	
}
