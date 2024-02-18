package com.example.onlineOrder.service;

import com.example.onlineOrder.dao.CustomerDao;
import com.example.onlineOrder.entity.Cart;
import com.example.onlineOrder.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lintingxuan
 * @create 2024-01-25 3:31 PM
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);

        customer.setEnabled(true);
        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }
}
