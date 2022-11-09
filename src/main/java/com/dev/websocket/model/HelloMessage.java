package com.dev.websocket.model;

public class HelloMessage {

    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }

    public HelloMessage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
