package com.bananeexp.servicebananeexp.exception;

import java.util.List;

public class InvalidEntityException extends RuntimeException {

    private ErrorCodes errorCodes;
    private List<String> errors;

    
}
