package com.main.paymentService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.paymentService.entity.TransactionEntity;


@Repository
public interface PaymentRepo extends JpaRepository<TransactionEntity, Long>{

}
