package com.example.onlinelearningmanagementsystem.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ErrorResponse handleException(HttpServletRequest request, Exception e){
        ErrorResponse response = new ErrorResponse();
        response.setMessage(e.getMessage());
        response.setPath(request.getRequestURI());
        return response;
    }

}
