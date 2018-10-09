package com.capgemini.customerapp.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.customerapp.entity.ErrorMessage;
import com.capgemini.customerapp.service.exception.CustomerNotFoundException;

@ControllerAdvice
@RestController
public class CustomerExceptionController {
	
	

		
		
		@ExceptionHandler(value = CustomerNotFoundException.class)
		public  ResponseEntity<ErrorMessage> customerNotFoundException(
				CustomerNotFoundException customerNotFoundException, HttpServletRequest request) {
			ErrorMessage errorMessage = new ErrorMessage(request.getRequestURI(), customerNotFoundException.getMessage(),
					LocalDateTime.now(), HttpStatus.NOT_FOUND);
			return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
		}

		
	}

