package com.main.orderService.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.orderService.service.Util;

@Service
public class UtilImpl implements Util {

	@Override
	public boolean isNeitherNullNorEmpty(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof List<?> && ((List) o).isEmpty()) {
			return false;
		}
		if (o instanceof String && ((String) o).trim().equals("")) {
			return false;
		}
		return true;
	}

}
