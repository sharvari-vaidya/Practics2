package com.main.multithreadingPool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.main")
public class MultithreadingPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultithreadingPoolApplication.class, args);
	}

}
