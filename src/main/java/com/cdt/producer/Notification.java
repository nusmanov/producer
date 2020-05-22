package com.cdt.producer;

public class Notification {
    private String user;

    public Notification() {
        // empty constructor
    }

    public Notification(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
