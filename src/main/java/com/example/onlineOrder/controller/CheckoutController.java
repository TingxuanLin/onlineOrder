package com.example.onlineOrder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author lintingxuan
 * @create 2024-02-28 7:57 PM
 */
@Controller
public class CheckoutController {
    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void checkout() {

    }
}
