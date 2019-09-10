package com.example.springsamples.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fernando Teran
 */
@RestController
public class MainController {
    @GetMapping("/")
    String hello() {
        return "Hello friend";
    }
}
