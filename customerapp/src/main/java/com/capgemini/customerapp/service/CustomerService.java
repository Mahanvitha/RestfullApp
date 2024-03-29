package com.capgemini.customerapp.service;

import java.util.List;

import com.capgemini.customerapp.entity.Customer;
import com.capgemini.customerapp.service.exception.CustomerNotFoundException;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateProfile(Customer customer);
	public Customer authenticate(Customer customer) throws CustomerNotFoundException;
	public Customer getCustomer(int customerId) throws CustomerNotFoundException;
	public void deleteCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer findCustomerById(int customerId);
	 

}
