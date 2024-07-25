package com.main.orderService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.orderService.model.OrderModel;
import com.main.orderService.service.OrderService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/insertOrder", method = RequestMethod.POST)
	public long placeOrder(@RequestBody OrderModel orderRequest) {
		log.info("In placeOrder controller :: for productId :: "+orderRequest.getProductId());
		long id= orderService.placeOrder(orderRequest);
		
		return id;
	}
	
	
	@RequestMapping(value = "/reduceQty/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Integer>  reduceQty(
			@PathVariable("id") long prodId,
			@RequestParam int qty) 
	{
		log.info("In reduceQty controller :: for productId :: "+prodId);
		int reduceQty = orderService.reduceQty(prodId,qty);
		return new ResponseEntity<Integer>(reduceQty,HttpStatus.OK);
	}
	
	
	

}
