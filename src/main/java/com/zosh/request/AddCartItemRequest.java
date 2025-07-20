package com.zosh.request;

import java.util.List;

public class AddCartItemRequest {

	private Long menuItemId;
	private int quantity;
	private List<String> ingredients;

	// Default constructor
	public AddCartItemRequest() {
	}

	// Parameterized constructor
	public AddCartItemRequest(Long menuItemId, int quantity, List<String> ingredients) {
		this.menuItemId = menuItemId;
		this.quantity = quantity;
		this.ingredients = ingredients;
	}

	// Getters and Setters
	public Long getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
}
