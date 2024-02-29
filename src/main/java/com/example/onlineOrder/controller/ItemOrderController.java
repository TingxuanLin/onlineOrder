package com.example.onlineOrder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lintingxuan
 * @create 2024-02-28 7:51 PM
 */
@Controller
public class ItemOrderController {
    @RequestMapping(value = "order/{menuId}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addMenuItemToCart(@PathVariable("menuId") int menuId) {

    }
}
