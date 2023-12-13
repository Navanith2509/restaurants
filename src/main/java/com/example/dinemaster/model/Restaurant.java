package com.example.dinemaster.model;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurantid")
    private int restaurantId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "cuisinetype")
    private String cuisineType;
    @Column(name = "rating")
    private int rating;

    public Restaurant() {
    }

    public Restaurant(int restaurantId, String name, String address, String cuisineType, int rating) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
        this.rating = rating;
    }

    public int getId() {
        return restaurantId;
    }

    public void setId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
