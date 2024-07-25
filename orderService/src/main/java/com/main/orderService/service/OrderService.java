package com.main.orderService.service;

import com.main.orderService.model.OrderModel;

public interface OrderService {

	long placeOrder(OrderModel orderRequest);

	int reduceQty(long prodId, int qty);

}
