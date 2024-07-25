package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class RunnableClass implements Runnable{

	private String key;
	private int value;
	
	
	@Autowired
	public RunnableClass(String key, int value) {
		this.key = key;
		this.value = value;
	}



	@Override
	public void run() {
//		String s= key+"@@@@@"+Thread.currentThread().getName();
		System.out.println(Thread.currentThread().getName());
		
	}

}
