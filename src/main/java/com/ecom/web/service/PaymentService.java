package com.ecom.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.web.entity.Payment;
import com.ecom.web.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentrepository;
	
	public Payment addMyPayment(Payment payment) {
        return paymentrepository.save(payment);
	
	}

	public List<Payment> getAllMyPayment() {
		return paymentrepository.findAll();
	
	}

}
