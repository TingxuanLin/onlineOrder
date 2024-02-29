package com.example.onlineOrder.controller;

import com.example.onlineOrder.entity.MenuItem;
import com.example.onlineOrder.entity.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lintingxuan
 * @create 2024-02-28 7:33 PM
 */
@Controller
public class MenuInfoController {
    @RequestMapping(value = "/restaurant/{restaurantId}/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuItem> getMenus(@PathVariable("restaurantId") int restaurantId) {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getRestaurants() {
        return new ArrayList<>();
    }
}
