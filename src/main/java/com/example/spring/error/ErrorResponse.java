package com.example.spring.error;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {
    private HttpStatus status;
    private String message;

    // Constructors, Getters, Setters
    public ErrorResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

}

