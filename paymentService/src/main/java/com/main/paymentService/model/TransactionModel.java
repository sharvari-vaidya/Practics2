package com.main.paymentService.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionModel {
	
	private long orderId;
	private PaymentMode paymentMode;
	private String referenceNum;
	private long amount;
//	http://localhost:9090/login/oauth2/code/okta
}
