package com.bananeexp.servicebananeexp.exception;

import java.util.List;

public class InvalidEntityException extends RuntimeException {

    private ErrorCodes errorCodes;
    private List<String> errors;

    public InvalidEntityException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable exception) {
        super(message, exception);

    }

    public EntityNotFoundException(String message, Throwable exception, ErrorCodes errorCodes) {
        super(message, exception);
        this.errorCodes = errorCodes;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCodes) {
        super(message);
        this.errorCodes = errorCodes;
    }

    
}
