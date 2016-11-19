package com.javapapo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${custom.property}")
    String customProperty;

    @RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "This is a test";
    }

    @RequestMapping(value = "/customprop", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getProperty() {
        return customProperty;
    }


}
