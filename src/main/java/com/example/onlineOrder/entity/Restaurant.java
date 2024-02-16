package com.example.onlineOrder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author lintingxuan
 * @create 2024-02-16 3:40 PM
 */
@Entity
@Table(name = "restaurants")
public class Restaurant implements Serializable {

    @Serial
    private static final long serialVersionUID = -5996516034257074587L;
    @Id
    private int id;
    
    private String address;
    
    private String name;
    
    private String phone;
    
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
