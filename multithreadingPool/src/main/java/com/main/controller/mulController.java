package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.service.MultithreadingService;
import com.main.service.TaskExecu;

@RestController
public class mulController {
	
	@Autowired
	MultithreadingService service;
	
	@Autowired
	TaskExecu te;
	
	@GetMapping("/mul")
	public void mul() {
		service.multi();
		
	}
	@GetMapping("/taskExecutor")
	public void taskExecutor() {
		te.taskExector();
		
		
	}

}
