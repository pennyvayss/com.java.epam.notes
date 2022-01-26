package com.java.epam.model.entity;

public class NotUniqueLoginException extends Throwable {
    private String loginData;

    public String getLoginData() {return loginData;}

    public NotUniqueLoginException(String message, String loginData) {
        super(message);
        this.loginData = loginData;
    }
}
