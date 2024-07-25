package com.main.productService.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
//@Table(name = "product_entity")
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = -3958032382814225920L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	@Column(name = "prod_name")
	private String name;
	@Column(name = "prod_price")
	private int price;
	@Column(name = "prod_qty")
	private int qty;

}
