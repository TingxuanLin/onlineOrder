package com.example.onlineOrder.controller;

import com.example.onlineOrder.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lintingxuan
 * @create 2024-01-24 11:30 AM
 */
/**
 * Use @Controller to mark a class its role as a web component, so the spring
 * mvc will register the methods which annotated the @RequestBody
 */
@Controller
public class SignUpController {
    /**
     *  @RequestMapping annotation to define REST API,
     *      such as HTTP URL, method, etc
     */
    @RequestMapping(value="/signup", method= RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    /**
     * @RequestBody: convert the request body in the http request to a backend project
     */
    public void signUp(@RequestBody Customer customer) {}

}
