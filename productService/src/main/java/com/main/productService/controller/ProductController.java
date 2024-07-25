package com.main.productService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.productService.entity.ProductEntity;
import com.main.productService.model.ProductModel;
import com.main.productService.service.ProductService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
	public long insertProductInTable(@RequestBody ProductModel product) {
		log.info("Entering insertProductInTable for name :: "+product.getName());
		long result = productService.insertProduct(product);
		log.info("Exiting insertProductInTable with result :: "+result);

		return result;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<ProductEntity>> getProduct(@PathVariable long id) {
		log.info("Entering getProduct for id :: "+id);
		Optional<ProductEntity> productDetails = productService.getProductDetails(id);
		log.info("Exiting getProduct for product :: "+productDetails.toString());
		return new ResponseEntity<Optional<ProductEntity>>(productDetails,HttpStatus.OK);

	}

}
