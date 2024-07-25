package com.main.paymentService.service;

import com.main.paymentService.model.TransactionModel;

public interface PaymentService {

	long doPayment(TransactionModel transactionReq);

}
