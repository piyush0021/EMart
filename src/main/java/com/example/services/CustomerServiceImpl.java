package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.Customer;
import com.example.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository c_repository;
	
	@Override
	public void update(Customer c,int cust_id) {
		c_repository.updateCustomer(cust_id, c.getaddLine1(),c.getaddLine1(),c.getCity(),c.getCust_Name(),c.getEmail(),c.getGender(),c.getPhone_No(),c.getPincode(),c.getRedeem_points());
	}

	@Override
	public Optional<Customer> getCustomerById(int cId) {
		return c_repository.findById(cId);
	}

	@Override
	public void addCustomer(Customer customer) {
		c_repository.save(customer);	
		
	}
}
