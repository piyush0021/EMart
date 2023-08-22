package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Customer;
import com.example.services.CustomerService;

@RestController
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	private CustomerService c_service;
	
	@PostMapping(value = "api/addCustomerss")
	public void addCustomer(@RequestBody Customer customer) {
		c_service.addCustomer(customer);
	}
	
	@GetMapping(value="api/getCustomer/{cId}")
	public Optional<Customer> getCustomerById(@PathVariable int cId){
		return c_service.getCustomerById(cId);
	}
	
	@PutMapping(value="api/editCustomer/{cust_id}")
	public void addCustuomer(@RequestBody Customer customer, @PathVariable int cust_id) {
		c_service.update(customer,cust_id);
	}
	
}
