package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class TaskExecu {

	@Autowired
	@Qualifier("ThreadPool1")
	TaskExecutor te1;
	
	@Autowired
	@Qualifier("ThreadPool2")
	TaskExecutor te2;
	
	@Autowired
	@Qualifier("ThreadPool3")
	TaskExecutor te3;
	
	@Autowired
	@Qualifier("ThreadPool4")
	TaskExecutor te4;

	public void taskExector() {
		for (int i = 0; i < 100; i++) {
			te1.execute(() -> {
				System.out.println("te1 "+Thread.currentThread().getName());
			});
			te2.execute(() -> {
				System.out.println("te2 "+Thread.currentThread().getName());
			});
			te3.execute(() -> {
				System.out.println("te3 "+Thread.currentThread().getName());
			});
			te4.execute(() -> {
				System.out.println("te4 "+Thread.currentThread().getName());
			});
			
		}
	}

}
