package com.main.orderService.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.orderService.entity.OrderEntity;
import com.main.orderService.model.OrderModel;
import com.main.orderService.repo.OrderRepo;
import com.main.orderService.service.OrderService;
import com.main.orderService.service.Util;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;

	@Autowired
	Util util;

	@Override
	public long placeOrder(OrderModel orderRequest) {
		log.info("In placeOrder :: Service");
		OrderEntity order = OrderEntity.builder().productId(orderRequest.getProductId())
				.orderPrice(orderRequest.getOrderPrice()).orderStatus(orderRequest.getOrderStatus())
				.orderDate(orderRequest.getOrderDate()).orderQty(orderRequest.getOrderQty()).paymentMode(orderRequest.getPaymentMode()).build();

		order = orderRepo.save(order);
		if (util.isNeitherNullNorEmpty(order.getId())) {
			return order.getId();
		}

		return 0;
	}

	@Override
	public int reduceQty(long prodId, int qty) {
		Optional<OrderEntity> order = orderRepo.findById(prodId);
		
		if(util.isNeitherNullNorEmpty(order)) {
			return 0;
			
		}
		if(!(order.get().getOrderQty()<qty)) {
			order.get().setOrderQty(order.get().getOrderQty()-qty);
			orderRepo.save(order.get());
			log.info("order.get().getQty() :: "+order.get().getOrderQty());
			return 1;
		}else {
			
			log.info("Qty cannot be changed :: "+order.get().getOrderQty());
//			return new CustomException("Error in order place",0);
			return 0;
		}
		
	}

}
