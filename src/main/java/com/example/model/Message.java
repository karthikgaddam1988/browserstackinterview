package com.example.model;

import java.util.Date;

public class Message {

    private Date dateTime;

    private String message;

    public Message(String message){
        this.message = message;
        this.dateTime = new Date(System.currentTimeMillis());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}
