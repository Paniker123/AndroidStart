package com.woodman.androidstart.Model;

/**
 * Created by Zver on 25.02.2018.
 */

public class Message {
    private String UserName;
    private String messageText;

    public Message() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
