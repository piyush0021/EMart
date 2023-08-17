package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Invoice;
import com.example.repositories.InvoiceDtlRepository;

@Service
public class InvoiceDtlServiceImpl implements InvoiceDtlService {

	@Autowired
	InvoiceDtlRepository repository;
	
	@Override
	public Optional<Invoice> getInvoiceDtl(int id) {
		return repository.findById(id);
	}
}
