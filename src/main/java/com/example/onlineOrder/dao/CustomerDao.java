package com.example.onlineOrder.dao;

import com.example.onlineOrder.entity.Customer;
import org.springframework.stereotype.Repository;

/**
 * @author lintingxuan
 * @create 2024-01-25 3:31 PM
 */
@Repository
public class CustomerDao {

    public void signUp(Customer customer) {

    }

    public Customer getCustomer(String email) {
        return new Customer();
    }
}
