package com.example.trixter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

    @RequestMapping("/")
    public String hello(){
        return  "I love spring boot";
    }
}
