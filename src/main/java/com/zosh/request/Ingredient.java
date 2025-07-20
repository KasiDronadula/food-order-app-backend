package com.zosh.request;

public class Ingredient {

	private String categoryName;
	private String ingredientName;

	// Default constructor
	public Ingredient() {
	}

	// Parameterized constructor
	public Ingredient(String categoryName, String ingredientName) {
		this.categoryName = categoryName;
		this.ingredientName = ingredientName;
	}

	// Getters and Setters

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
}
