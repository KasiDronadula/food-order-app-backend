package com.zosh.request;

public class CreateIngredientRequest {

    private Long restaurantId;
    private String name;
    private Long ingredientCategoryId;

    // Default constructor
    public CreateIngredientRequest() {
    }

    // Parameterized constructor
    public CreateIngredientRequest(Long restaurantId, String name, Long ingredientCategoryId) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.ingredientCategoryId = ingredientCategoryId;
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

    public Long getIngredientCategoryId() {
        return ingredientCategoryId;
    }

    public void setIngredientCategoryId(Long ingredientCategoryId) {
        this.ingredientCategoryId = ingredientCategoryId;
    }
}
