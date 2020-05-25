package com.cdt.producer;

public class Notification {
    private String user;
    private Integer id;

    public Notification() {
        // empty constructor
    }

    public Notification(String user, Integer id) {
        this.user = user;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
