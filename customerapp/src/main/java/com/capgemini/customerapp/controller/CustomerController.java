package com.capgemini.customerapp.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.customerapp.entity.Customer;
import com.capgemini.customerapp.service.CustomerService;
import com.capgemini.customerapp.service.exception.CustomerNotFoundException;

@RestController
public class CustomerController {
	private final static Logger LOGGER = Logger.getLogger(CustomerController.class.getName());
	@Autowired
	CustomerService customerService;
	
	
//	@PostMapping("/customer")
//	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
//		ResponseEntity<Customer> responseEntity = new ResponseEntity<Customer>(customerAppService.addCustomer(customer),HttpStatus.OK);
//		LOGGER.info("xyz");
//		return responseEntity;
//	}

//	@PutMapping("/customers")
//	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer Customer) {
//			LOGGER.info("Updated Customer with Id :"+ Customer.getCustomerId()+" to : "+Customer);
//			return new ResponseEntity<Customer>(customerAppService.updateProfile(Customer), HttpStatus.OK);
//	}
//
//	@PostMapping("/customers/customer")
//	public ResponseEntity<Customer> authenticateCustomer(@RequestBody Customer customer) throws CustomerNotFoundException {
//		ResponseEntity<Customer> responseEntity;
//			responseEntity = new ResponseEntity<Customer>(customerAppService.authenticate(customer),
//					HttpStatus.OK);
//			LOGGER.info("Authenticate Customer :"+ customer);
//			return responseEntity;
//	}
//	
	@DeleteMapping("/customers/{customerId}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable Customer customer) throws CustomerNotFoundException {
				customerService.deleteCustomer(customer);
				LOGGER.info("Deleted Customer by id: "+customer);
				return new ResponseEntity<Customer>(HttpStatus.OK);
	}
//
//	@GetMapping("/customer/{customerId}")
//	public ResponseEntity<Customer> findCustomerById(@PathVariable int customerId){
//		try {
//			Customer c = customerAppService.findCustomerById(customerId);
//		if(c!=null)
//			return new ResponseEntity<Customer>(c,HttpStatus.OK);
//		}
//		catch(CustomerNotFoundException exception) {
//			
//		}
//		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
//	}
//	@GetMapping("/customer/{customerId}")
//	public ResponseEntity<Customer> getCustomer(@PathVariable int customerId){
//		try {
//			Customer c = customerAppService.findCustomerById(customerId);
//		if(c!=null)
//			return new ResponseEntity<Customer>(c,HttpStatus.OK);
//		}
//		catch(CustomerNotFoundException exception) {
//			
//		}
//		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
//	}
	
//	@GetMapping("/customer/{customerId}")
//	public @ResponseBody ResponseEntity<List<Customer>> findAllCustomer(){
//		return new ResponseEntity<List<Customer>>(customerAppService.getAllCustomers(),HttpStatus.OK);
//	}
//	
//	
//
//}
//
	
	
}
