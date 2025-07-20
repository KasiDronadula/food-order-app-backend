package com.zosh.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class IngredientCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;

	@JsonIgnore
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<IngredientsItem> ingredients = new ArrayList<>();

	// No-args constructor
	public IngredientCategory() {
	}

	// All-args constructor
	public IngredientCategory(Long id, String name, Restaurant restaurant, List<IngredientsItem> ingredients) {
		this.id = id;
		this.name = name;
		this.restaurant = restaurant;
		this.ingredients = ingredients;
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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<IngredientsItem> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<IngredientsItem> ingredients) {
		this.ingredients = ingredients;
	}
}
