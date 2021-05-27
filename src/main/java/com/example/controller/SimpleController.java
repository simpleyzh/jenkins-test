package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple
 */
@RestController
public class SimpleController {
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
