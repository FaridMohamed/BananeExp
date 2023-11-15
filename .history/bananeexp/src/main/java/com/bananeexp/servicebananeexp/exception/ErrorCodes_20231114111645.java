package com.bananeexp.servicebananeexp.exception;

public enum ErrorCodes{

    CLIENT_NON_TROUVER(10),CLIENT_COM_NON_TROUVER(20);

    private int code;

    ErrorCodes(int code){
        this.code=code;
    }

    public int getCode(){
        return code;
    }
}