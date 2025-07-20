package com.zosh.request;

public class CreateIngredientCategoryRequest {

    private Long restaurantId;
    private String name;

    // Default constructor
    public CreateIngredientCategoryRequest() {
    }

    // Parameterized constructor
    public CreateIngredientCategoryRequest(Long restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
    }

    // Getters and Setters
    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
