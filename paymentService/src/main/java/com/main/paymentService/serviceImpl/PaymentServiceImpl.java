package com.main.paymentService.serviceImpl;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.paymentService.entity.TransactionEntity;
import com.main.paymentService.model.TransactionModel;
import com.main.paymentService.repo.PaymentRepo;
import com.main.paymentService.service.PaymentService;


@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepo payRepo;

	@Override
	public long doPayment(TransactionModel transactionReq) {

		TransactionEntity tranEntity = TransactionEntity.builder().orderId(transactionReq.getOrderId())
				.paymentMode(transactionReq.getPaymentMode().name())
				.amount(transactionReq.getAmount())
				.referenceNum(transactionReq.getReferenceNum())
				.paymentStatus("SUCCESS")
				.transactionDate(Instant.ofEpochMilli(System.currentTimeMillis()))
				.build();
		
		tranEntity = payRepo.save(tranEntity);
		if(!(tranEntity.getId()==0)) {
			return tranEntity.getId();
		}
		return 0;
	}

}
