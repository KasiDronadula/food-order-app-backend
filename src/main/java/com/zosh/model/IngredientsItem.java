package com.zosh.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class IngredientsItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@ManyToOne
	private IngredientCategory category;

	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;

	private boolean inStoke = true;

	// No-args constructor
	public IngredientsItem() {
	}

	// All-args constructor
	public IngredientsItem(Long id, String name, IngredientCategory category, Restaurant restaurant, boolean inStoke) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.restaurant = restaurant;
		this.inStoke = inStoke;
	}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IngredientCategory getCategory() {
		return category;
	}

	public void setCategory(IngredientCategory category) {
		this.category = category;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public boolean isInStoke() {
		return inStoke;
	}

	public void setInStoke(boolean inStoke) {
		this.inStoke = inStoke;
	}
}
