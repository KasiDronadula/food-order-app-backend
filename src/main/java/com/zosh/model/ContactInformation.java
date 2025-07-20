package com.zosh.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ContactInformation {

    private String email;
    private String mobile;
    private String twitter;
    private String instagram;

    // No-args constructor
    public ContactInformation() {
    }

    // All-args constructor
    public ContactInformation(String email, String mobile, String twitter, String instagram) {
        this.email = email;
        this.mobile = mobile;
        this.twitter = twitter;
        this.instagram = instagram;
    }

    // Getters and Setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}
