package com.virtuocode.houdaclient.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
@RestControllerAdvice
public class ExceptionHandlers {

    /**
     * This function receives an exception of type an entity is invalid
     *
     * @param ex the exception
     * @return the response that contains validation errors
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidEntityException(RuntimeException ex) {
        return ex.getMessage();
    }
}
