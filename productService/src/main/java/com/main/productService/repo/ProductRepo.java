package com.main.productService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.productService.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

}
