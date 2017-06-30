package com.mengru.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lime001 on 6/29/17.
 */
@RestController
public class FirstClientController {

    @Value("${test.configValue}") String configValue;

    @RequestMapping("/firstclient")
    public String showConfigValue()
    {
        return configValue;
    }
}
