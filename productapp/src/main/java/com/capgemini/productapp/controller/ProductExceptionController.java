package com.capgemini.productapp.controller;

import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.productapp.entity.ErrorMessage;
import com.capgemini.productapp.service.exceptions.ProductNotFoundException;

@ControllerAdvice
@RestController
public class ProductExceptionController {

	@ExceptionHandler(value=ProductNotFoundException.class)
	public  ResponseEntity<ErrorMessage> ProductNotFoundException(
			ProductNotFoundException productNotFoundException, HttpServletRequest request) {
		ErrorMessage errorMessage = new ErrorMessage(request.getRequestURI(), productNotFoundException.getMessage(),
				LocalDateTime.now(), HttpStatus.NOT_FOUND);
	
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}






}
