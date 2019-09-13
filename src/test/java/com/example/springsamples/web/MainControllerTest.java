package com.example.springsamples.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Fernando Teran
 */
class MainControllerTest {
    MainController controller;

    @BeforeEach
    void setUp() {
        controller = new MainController();
    }

    @Test
    void hello() {
        assertEquals("Hello friend", controller.hello());
    }

}