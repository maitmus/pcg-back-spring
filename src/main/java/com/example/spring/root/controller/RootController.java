package com.example.spring.root.controller;

import com.example.spring.root.service.RootService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {
    RootService rootService;
    public RootController(RootService rootService) {
        this.rootService = rootService;
    }

    @GetMapping
    public ResponseEntity<String> checkHealth() {
        return this.rootService.checkHealth();
    }
}
