package com.main.paymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.paymentService.model.TransactionModel;
import com.main.paymentService.service.PaymentService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@RequestMapping(value = "/doPayment", method = RequestMethod.POST)
	public ResponseEntity<Long> doPayment(@RequestBody TransactionModel transactionReq) {
		log.info("In doPayment controller for orderId :: " + transactionReq.getOrderId());
		long id = paymentService.doPayment(transactionReq);
		log.info("Received tranId :: " + id);
		return new ResponseEntity<>(id, HttpStatus.OK);

	}

}
