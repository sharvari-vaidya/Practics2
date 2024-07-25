package com.springauth.main.controller;


import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springauth.main.controller.Service.UserService;
import com.springauth.main.model.UserData;


@RestController
@RequestMapping("/getData")
public class RequestCont {
	
	@Autowired
	UserService users;
	
	@RequestMapping(value="/getName", method=RequestMethod.GET)
	public List<UserData> getName() {
		System.out.println("Getting users");
		return users.getuserdata();
	}

	@RequestMapping(value="/getPass", method=RequestMethod.GET)
	public String getPass() {
		return "ydgfuyewf";
	}
	
	@RequestMapping(value= "/getLoggedInusers" , method=RequestMethod.GET)
	public String getLoggedInUsers(Principal p) {
		return p.getName();
		
	}
	
//	@RequestMapping(value="/generateToken", method=RequestMethod.POST)
//	public String generateToken(@RequestBody AuthReq req) {
//		return null;
//	}
	
}
