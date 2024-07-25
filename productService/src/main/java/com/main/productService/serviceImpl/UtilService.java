package com.main.productService.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.productService.service.Util;

@Service
public class UtilService implements Util {

	@Override
	public boolean isNeitherNullNorEmpty(Object obj) {
		if(obj==null) {
			return false;
		}if(obj instanceof List<?> && ((List) obj).isEmpty()) {
			return false;
		}if(obj instanceof String && ((String) obj).trim().equals("")) {
			return false;
		}
		return true;
	}

}
