package com.zosh.request;

public class ReviewRequest {

    private Long restaurantId;
    private double rating;
    private String reviewText;

    // Default constructor
    public ReviewRequest() {
    }

    // Parameterized constructor
    public ReviewRequest(Long restaurantId, double rating, String reviewText) {
        this.restaurantId = restaurantId;
        this.rating = rating;
        this.reviewText = reviewText;
    }

    // Getters and Setters
    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
