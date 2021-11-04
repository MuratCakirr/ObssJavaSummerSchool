package com.example.customexceptionservlet;

import javax.servlet.ServletException;

public class CustomException extends ServletException {
    public CustomException(String message) {
        super(message);
    }
}
