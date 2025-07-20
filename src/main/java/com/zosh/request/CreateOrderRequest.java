package com.zosh.request;

import com.zosh.model.Address;

public class CreateOrderRequest {

	private Long restaurantId;
	private Address deliveryAddress;

	// Default constructor
	public CreateOrderRequest() {
	}

	// Parameterized constructor
	public CreateOrderRequest(Long restaurantId, Address deliveryAddress) {
		this.restaurantId = restaurantId;
		this.deliveryAddress = deliveryAddress;
	}

	// Getters and Setters
	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}
