package com.ecom.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.web.entity.Payment;

public interface PaymentRepository extends JpaRepository <Payment, Long> {
		

}
