package com.main.paymentService.entity;

import java.time.Instant;

import org.hibernate.annotations.GeneratorType;

import com.main.paymentService.model.PaymentMode;
import com.main.paymentService.model.TransactionModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="transaction_entity")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "order_id")
	private long orderId;
	
	@Column(name = "payment_mode")
	private String paymentMode;
	
	@Column(name = "transaction_date")
	private Instant transactionDate;
	
	@Column(name = "ref_num")
	private String referenceNum;
	
	@Column(name="payment_status")
	private String paymentStatus;
	
	@Column(name = "amount")
	private long amount;

}
