package com.example.services;

import java.util.Optional;
import com.example.entities.Invoice;

public interface InvoiceDtlService {
	Optional<Invoice> getInvoiceDtl(int id);
}
