package com.main.productService.service;


import java.util.Optional;

import com.main.productService.entity.ProductEntity;
import com.main.productService.model.ProductModel;

public interface ProductService {
	

	public long insertProduct(ProductModel product);

	public Optional<ProductEntity> getProductDetails(long productId);
	

}
