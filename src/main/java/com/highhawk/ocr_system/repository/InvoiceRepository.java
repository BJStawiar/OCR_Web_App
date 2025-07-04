package com.highhawk.ocr_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.highhawk.ocr_system.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
