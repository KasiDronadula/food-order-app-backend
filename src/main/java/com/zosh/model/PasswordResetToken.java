package com.zosh.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class PasswordResetToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String token;

	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	private User user;

	private Date expiryDate;

	// No-args constructor
	public PasswordResetToken() {
	}

	// Constructor with required fields (token, user, expiryDate)
	public PasswordResetToken(String token, User user, Date expiryDate) {
		this.token = token;
		this.user = user;
		this.expiryDate = expiryDate;
	}

	// All-args constructor
	public PasswordResetToken(Integer id, String token, User user, Date expiryDate) {
		this.id = id;
		this.token = token;
		this.user = user;
		this.expiryDate = expiryDate;
	}

	public boolean isExpired() {
		return expiryDate.before(new Date());
	}

	// Getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
}
