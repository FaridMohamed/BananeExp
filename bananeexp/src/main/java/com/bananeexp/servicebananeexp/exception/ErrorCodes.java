package com.bananeexp.servicebananeexp.exception;

public enum ErrorCodes {

    CLIENT_NON_TROUVER(10), COMM_INV(30),
    CLIENT_INV(20), COM_NON_TROUVER(40);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}