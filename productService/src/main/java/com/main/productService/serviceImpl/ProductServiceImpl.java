package com.main.productService.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.productService.entity.ProductEntity;
import com.main.productService.model.ProductModel;
import com.main.productService.repo.ProductRepo;
import com.main.productService.service.ProductService;
import com.main.productService.service.Util;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Autowired
	Util util;

	@Override
	public long insertProduct(ProductModel productRequest) {
		try {
			
			ProductEntity product = ProductEntity.builder().name(productRequest.getName())
					.price(productRequest.getPrice()).qty(productRequest.getQty()).build();
					product =productRepo.save(product);
			log.info("Product :: " + product.toString());
			if (util.isNeitherNullNorEmpty(product.getProductId())) {
				return product.getProductId();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Optional<ProductEntity> getProductDetails(long productId) {

		Optional<ProductEntity> findById = productRepo.findById(productId);

		return findById;
	}

}
