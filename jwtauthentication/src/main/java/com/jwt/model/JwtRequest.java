package com.jwt.model;

public class JwtRequest {

	String username;
	
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
	String password;
	public JwtRequest() {
		super();
	}
	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "JwtRequest{" + "username='" + username + '\'' + 
				", password='" + password + '\''+ '}';
	}

}
