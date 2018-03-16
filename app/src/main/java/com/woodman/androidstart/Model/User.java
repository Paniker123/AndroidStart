package com.woodman.androidstart.Model;

/**
 * Created by Zver on 25.02.2018.
 */

public class User {

    private String nick;
    private String password;
    private SEX sex;

    public User() {
    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }
}
