package com.example.onlineOrder.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author lintingxuan
 * @create 2024-02-16 3:14 PM
 */
@Entity
@Table(name="cart")
public class Cart implements Serializable {

    private static final long serialVersionUID = 8436097833452420298L;

    @Id // used as primary key
    @GeneratedValue(strategy= GenerationType.AUTO) // generate id auto
    private int id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderItem> orderItemList;

    private double totalPrice;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
