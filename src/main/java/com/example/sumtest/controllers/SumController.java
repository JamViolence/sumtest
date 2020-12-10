package com.example.sumtest.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {

    @GetMapping
    public static float getSum(@RequestParam(value = "n1", defaultValue = "0") float n1, @RequestParam(value = "n2", defaultValue = "0") float n2) {
        return n1 + n2;
    }
}
