package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Customer;

public interface CustomerService {
	void update(Customer customer,int cust_id);
	Optional<Customer> getCustomerById(int cId);
	void addCustomer(Customer customer);
}
