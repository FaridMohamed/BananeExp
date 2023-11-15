package com.bananeexp.servicebananeexp.exception;

public class EntityNotFoundException extends RuntimeException {

    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message)
    }

}