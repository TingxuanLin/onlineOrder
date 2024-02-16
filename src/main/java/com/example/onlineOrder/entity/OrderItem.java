package com.example.onlineOrder.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author lintingxuan
 * @create 2024-02-16 3:38 PM
 */
@Entity
@Table(name = "orderitem")
public class OrderItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 5425504123711332582L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
