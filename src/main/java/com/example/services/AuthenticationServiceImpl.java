package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Authentication;
import com.example.repositories.*;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private AuthenticationRepository auth_repo;
	
	public Optional<Authentication> getAuthentication(int Auth_id) {
		return auth_repo.findById(Auth_id);
	}

	@Override
	public void addAuthentication(Authentication authentication) {
		auth_repo.save(authentication);		
	}
	
}
