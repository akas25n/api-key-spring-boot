package com.apikey.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public String greeting(){
        return "Hello there !!";
    }

    @RequestMapping("/check")
    public String apiCheck() {
        return "API Key check !!";
    }
}
