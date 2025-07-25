package com.zosh.request;

public class UpdateCartItemRequest {

	private Long cartItemId;
	private int quantity;

	// Default constructor
	public UpdateCartItemRequest() {
	}

	// Parameterized constructor
	public UpdateCartItemRequest(Long cartItemId, int quantity) {
		this.cartItemId = cartItemId;
		this.quantity = quantity;
	}

	// Getters and Setters
	public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
