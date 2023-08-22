package com.example.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Invoice;
import com.example.services.InvoiceDtlService;

@RestController 
@CrossOrigin("*")
public class InvoiceDtlController {
	
	@Autowired
	InvoiceDtlService inv_dt_service;
	
	@GetMapping(value = "api/invoicedtl/{id}")
	 public Optional<Invoice> getInvoiceDtl(@PathVariable int id)
	 {
		return inv_dt_service.getInvoiceDtl(id);
	 }
}
