package com.bananeexp.servicebananeexp.exception;

public class EntityNotFoundException extends RuntimeException {

    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException( String message, Throwable exception){
        super(message, exception);

    }

    public EntityNotFoundException( String message, Throwable exception, ErrorCodes errorCodes){
          super(message, exception);
          this.errorCodes=errorCodes
    }


}