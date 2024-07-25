package com.main.configuration;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadPoolConfig {

	@Bean("ThreadPool1")
	public TaskExecutor getThreadPool1() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(16);
		executor.setMaxPoolSize(50);
		executor.setThreadNamePrefix("Thread--");
	    executor.setQueueCapacity(1000); 
	    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
	    executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}
	@Bean("ThreadPool2")
	public TaskExecutor getThreadPool2() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(20);
		executor.setMaxPoolSize(50);
		executor.setThreadNamePrefix("Thread--");
	    executor.setQueueCapacity(1000); 
	    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
	    executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}
	@Bean("ThreadPool3")
	public TaskExecutor getThreadPool3() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(16);
		executor.setMaxPoolSize(50);
		executor.setThreadNamePrefix("Thread--");
	    executor.setQueueCapacity(1000); 
	    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
	    executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}
	@Bean("ThreadPool4")
	public TaskExecutor getThreadPool4() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(16);
		executor.setMaxPoolSize(50);
		executor.setThreadNamePrefix("Thread--");
	    executor.setQueueCapacity(1000); 
	    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
	    executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}
	@Bean("ThreadPool1")
	public TaskExecutor getThreadPool() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(50);
		executor.setThreadNamePrefix("Thread--");
	    executor.setQueueCapacity(1000); 
	    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
	    executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}
}
