package com.bananeexp.servicebananeexp.exception;

import java.util.List;

public class InvalidEntityException extends RuntimeException {

    private ErrorCodes errorCodes;
    private List<String> errors;

    public InvalidEntityException(String message) {
        super(message);
    }

    public InvalidEntityException(String message, Throwable exception) {
        super(message, exception);

    }

    public InvalidEntityException(String message, Throwable exception, ErrorCodes errorCodes) {
        super(message, exception);
        this.errorCodes = errorCodes;
    }

    public InvalidEntityException(String message, ErrorCodes errorCodes) {
        super(message);
        this.errorCodes = errorCodes;
    }

    public InvalidEntityException(String message, ErrorCodes errorCodes, List<String> errors) {
        super(message);
        this.errorCodes = errorCodes;
        this.errors=err
    }




    
}
