package com.main.orderService.Exception;

public class CustomException extends RuntimeException{
	
	String errorMessage;
	int error;
	
	CustomException(String errorMessage,int error){
		super(errorMessage);
		this.error=error;
	}

}
