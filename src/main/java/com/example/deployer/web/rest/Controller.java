package com.example.deployer.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/v4")
    public String foo() {
        return "mandarin ";
    }
}
