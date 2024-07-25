package com.main.orderService.entity;

import java.io.Serializable;
import java.time.Instant;

import com.main.orderService.enums.PaymentMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity implements Serializable{
	
	private static final long serialVersionUID = -3958032382814225920L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="product_id")
	private long productId;
	
	@Column(name="order_price")
	private int orderPrice;
	
	@Column(name="order_qty")
	private int orderQty;
	
	@Column(name="order_status")
	private String orderStatus;
	
	
	@Column(name="order_date")
	private Instant orderDate;
	
	@Column(name="payment_mode")
	private PaymentMode paymentMode;

	

}
