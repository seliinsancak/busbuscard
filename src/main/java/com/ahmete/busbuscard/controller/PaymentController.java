package com.ahmete.busbuscard.controller;

import com.ahmete.busbuscard.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {
	private final PaymentService paymentService;
}