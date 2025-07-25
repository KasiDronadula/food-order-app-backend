package com.zosh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Events {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String image;

	private String startedAt;

	private String endsAt;

	private String name;

	@ManyToOne
	private Restaurant restaurant;

	private String location;

	// No-args constructor
	public Events() {
	}

	// All-args constructor
	public Events(Long id, String image, String startedAt, String endsAt, String name, Restaurant restaurant, String location) {
		this.id = id;
		this.image = image;
		this.startedAt = startedAt;
		this.endsAt = endsAt;
		this.name = name;
		this.restaurant = restaurant;
		this.location = location;
	}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}

	public String getEndsAt() {
		return endsAt;
	}

	public void setEndsAt(String endsAt) {
		this.endsAt = endsAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
