//package com.springauth.main;
//
//import java.sql.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.Jwts;
//
//@Component
//public class JWTService {
//	
//	public String generateJWTToken(String username) {
//		Map<String,Object> map= new HashMap<>();
//		return createToken(map,username);
//		
//	}
//
//	private String createToken(Map<String, Object> map, String username) {
//		
//		
//		return Jwts.builder()
//				.setClaims(map)
//				.setSubject(username)
//				.setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis())+1000*60*30)
//				.signWith();
//	}
//	
//	private Key getKey() {
//		
//	}
//
//}
