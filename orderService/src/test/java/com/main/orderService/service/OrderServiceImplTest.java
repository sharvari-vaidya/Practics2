package com.main.orderService.service;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.orderService.repo.OrderRepo;
import com.main.orderService.serviceimpl.OrderServiceImpl;

@SpringBootTest
public class OrderServiceImplTest {

	
	@Mock
	OrderRepo orderRepo;

	@Mock
	Util util;
	
	@InjectMocks
	OrderService orderServie = new OrderServiceImpl();
	
	@Test
	void test_When_Order_Success() {
	
	}
	
}
