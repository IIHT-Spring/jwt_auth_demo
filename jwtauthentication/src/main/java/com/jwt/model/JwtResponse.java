package com.jwt.model;

public class JwtResponse {
	String Token;

	public String getToken() {
		return Token;
	}

	public JwtResponse(String token) {
		super();
		Token = token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public JwtResponse() {
		super(); 
	}
	

}
