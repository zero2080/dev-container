package com.biomatz.playground.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BasicService {

    public Map<String,String> welcome(){
        return Map.of("message","Hello~ World!!");
    }
}
