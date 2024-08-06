package com.biomatz.playground.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biomatz.playground.service.BasicService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService service;

    @GetMapping
    public Map<String,String> welcome(){
        return service.welcome();

    }

}
