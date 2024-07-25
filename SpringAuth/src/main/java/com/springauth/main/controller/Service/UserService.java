package com.springauth.main.controller.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springauth.main.model.UserData;

@Service
public class UserService {
	
	private List<UserData> users= new ArrayList<>();
	
	public UserService() {
		users.add(new UserData("gew","prhreas123",UUID.randomUUID().toString(),"rhg@gmail.com"));
		users.add(new UserData("hjefouhgf","pasrhgr123",UUID.randomUUID().toString(),"rhg@gmail.com"));
		users.add(new UserData("shargregvrvari","rhgre",UUID.randomUUID().toString(),"hbre@gmail.com"));
		users.add(new UserData("sharvari","pas123",UUID.randomUUID().toString(),"iugefy@gmail.com"));
	}
	
	public List<UserData> getuserdata(){
		return users;
	}

}
