package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Cart;
import com.example.repositories.CartRepository;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository cart_repository;
	
	@Override
	public List<Cart> getCart() {
		return cart_repository.findAll();
	}

	@Override
	public void addCart(Cart cart) {
		cart_repository.save(cart);
	}

	@Override
	public void addByProject(Cart cart, int cid) {
		cart_repository.findById(cid);
	}

}
