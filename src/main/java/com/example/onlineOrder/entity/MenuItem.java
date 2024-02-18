package com.example.onlineOrder.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


import java.io.Serializable;

/**
 * @author lintingxuan
 * @create 2024-02-16 3:35 PM
 */
@Entity
@Table(name = "menuitem")
public class MenuItem implements Serializable {


    private static final long serialVersionUID = -7316749690369267468L;
    @Id
    private int id;

    private String name;

    private String description;

    private double price;

    private String imageUrl;

    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
