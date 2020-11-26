package com.hainv.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    LOGIN_FAIL(2001, "Login Failed: Your user ID or password is incorrect."),
    FILE_NOT_EXIST(2002, "File may not exist."),
    DECLARING_CLASS_FAIL(2003, "The specified object is not an instance of the class or interface declaring the underlying field."),
    FIELD_INACCESSIBLE(2004, "If this object is enforcing java language access control and the underlying field is inaccessible."),
    WRITE_FILE_FAIL(2005, "Anything can't be written."),
    PARSEEXCEPTION(2006, "Can't parse string to date");
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
