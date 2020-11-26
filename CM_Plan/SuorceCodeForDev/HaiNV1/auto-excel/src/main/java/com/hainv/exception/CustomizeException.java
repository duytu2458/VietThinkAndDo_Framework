package com.hainv.exception;

public class CustomizeException extends Exception {
    private static final long serialVersionUID = 1L;
    private String message;
    private Integer code;
    private final Throwable cause; 

    public CustomizeException(ICustomizeErrorCode errorCode, Throwable cause) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        this.cause = cause; 
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
    
    @Override
    public Throwable getCause() {
        return cause; 
    }

}
