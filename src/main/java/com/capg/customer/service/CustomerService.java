package com.capg.customer.service;

import java.util.List;

import com.capg.customer.entities.Customer;
import com.capg.customer.exception.AuthenticationFailedException;
import com.capg.customer.exception.CustomerAlreadyExistException;
import com.capg.customer.exception.CustomerNotFoundException;



public interface CustomerService {
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistException;

	public Customer authentication(Customer customer) throws CustomerNotFoundException, AuthenticationFailedException;

	public Customer getCustomerById(int customerId) throws CustomerNotFoundException;

	public List<Customer> getAllCustomers();

	public void deleteCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer editCustomer(Customer customer) throws CustomerNotFoundException;
}