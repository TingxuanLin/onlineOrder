package com.example.onlineOrder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.io.Serializable;

/**
 * @author lintingxuan
 * @create 2024-02-15 2:50 PM
 */

@Entity
@Table(name="authorities")
public class Authorities implements Serializable {
    private static final long serialVersionUID = 8734140534986494039L;

    @Id
    private String email;

    private String authorities;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }


}
