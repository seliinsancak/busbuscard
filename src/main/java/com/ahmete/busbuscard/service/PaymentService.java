package com.ahmete.busbuscard.service;

import com.ahmete.busbuscard.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
}