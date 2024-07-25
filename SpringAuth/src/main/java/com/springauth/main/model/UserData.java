package com.springauth.main.model;

public class UserData {

	
	private String username;
	private String password;
	private String userId;
	private String email;
	
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserData(String username, String password, String userId, String email) {
		super();
		this.username = username;
		this.password = password;
		this.userId = userId;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserData [username=" + username + ", password=" + password + ", userId=" + userId + ", email=" + email
				+ "]";
	}
	
	
	
}
