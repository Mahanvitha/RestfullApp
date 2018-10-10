package com.capgemini.customerapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.customerapp.entity.Customer;
import com.capgemini.customerapp.repository.CustomerRepository;
import com.capgemini.customerapp.service.CustomerService;
import com.capgemini.customerapp.service.exception.CustomerNotFoundException;

@Service
public class CustomerServiceImpl  implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateProfile(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer authenticate(Customer customer) throws CustomerNotFoundException {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());
		if (optionalCustomer.isPresent()) {
			Customer cust = optionalCustomer.get();
			if (customer.getCustomerId() == cust.getCustomerId()) {
				if (cust.getPassword().equals(customer.getPassword())) {
					return customerRepository.findById(customer.getCustomerId()).get();
				}
				throw new CustomerNotFoundException("Id or Password does not exists.");
			}
		}
		throw new CustomerNotFoundException("Customer does not exists");
	}
	

	@Override
	public Customer getCustomer(int customerId) throws CustomerNotFoundException {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		 customerRepository.delete(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();

	}

	@Override
	public Customer findCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
}
