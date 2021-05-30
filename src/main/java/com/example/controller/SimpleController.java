package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple
 */
@RestController
public class SimpleController {
    private final Logger logger = LoggerFactory.getLogger(SimpleController.class);
    @GetMapping("/hello_world")
    public String test() {
        return "hello world";
    }

    @GetMapping("/test")
    public String test2() {
        logger.info("test");
        return "test";
    }
}
