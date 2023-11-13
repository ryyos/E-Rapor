package com.erapor.erapor.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
