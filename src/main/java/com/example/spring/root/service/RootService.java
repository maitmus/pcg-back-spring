package com.example.spring.root.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RootService {
    public ResponseEntity<String> checkHealth() {
        return ResponseEntity.ok("Hello World");
    }
}
