package com.example.onlineOrder.controller;

import com.example.onlineOrder.entity.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lintingxuan
 * @create 2024-02-28 7:55 PM
 */
@Controller
public class CartController {
    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    @ResponseBody
    public Cart getCart() {
        return new Cart();
    }
}
