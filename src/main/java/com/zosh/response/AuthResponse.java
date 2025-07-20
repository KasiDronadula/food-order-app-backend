package com.zosh.response;

import com.zosh.domain.USER_ROLE;

public class AuthResponse {

	private String message;
	private String jwt;
	private USER_ROLE role;

	// Default constructor
	public AuthResponse() {
	}

	// Parameterized constructor
	public AuthResponse(String message, String jwt, USER_ROLE role) {
		this.message = message;
		this.jwt = jwt;
		this.role = role;
	}

	// Getters and Setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public USER_ROLE getRole() {
		return role;
	}

	public void setRole(USER_ROLE role) {
		this.role = role;
	}
}
