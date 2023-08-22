package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Authentication;

public interface AuthenticationService {
	
	Optional<Authentication> getAuthentication(int Auth_id);
	void addAuthentication(Authentication authentication);
}
