package com.main.orderService.model;

import java.time.Instant;

import com.main.orderService.enums.PaymentMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderModel {

	private long productId;
	private int orderPrice;
	private int orderQty;
	private String orderStatus ;
	private Instant orderDate;
	private PaymentMode paymentMode;

}
