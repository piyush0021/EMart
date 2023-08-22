package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Authentication;
import com.example.entities.Product;
import com.example.services.AuthenticationService;

@RestController  
@CrossOrigin("*")
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService auth_service;
		
	@GetMapping(value = "api/AuthenticationById/{auth_id}")
	public Optional<Authentication> getPro(@PathVariable int auth_id)
	{
		return auth_service.getAuthentication(auth_id);
	}
	
	@PostMapping(value = "api/addAuthentication")
	public void addAuthentication(@RequestBody Authentication authentication) {
		System.out.println("helllo react");
		auth_service.addAuthentication(authentication);
	}
	
}

