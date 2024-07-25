package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class MultithreadingService {

	@Autowired
	@Qualifier("ThreadPool2")
	TaskExecutor pool;

	@Autowired
	ApplicationContext context;

	public void multi() {
		try {
			System.out.println("In multi threading request :::::::::::");

			for (int i = 0; i < 10000000; i++) {
				RunnableClass runnable = context.getBean(RunnableClass.class, "name" + i, i);
				pool.execute(runnable);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
