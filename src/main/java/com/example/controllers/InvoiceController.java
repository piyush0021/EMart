package com.example.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Invoice;
import com.example.services.InvoiceService;

@RestController
@CrossOrigin("*")
public class InvoiceController
{
	@Autowired
	public InvoiceService inv_service;
	
	@GetMapping("api/invoices")
	public List<Invoice> getInvoices()
	{
		return inv_service.getInvoices();
	}
	
}
