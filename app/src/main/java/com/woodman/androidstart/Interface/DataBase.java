package com.woodman.androidstart.Interface;


import com.woodman.androidstart.Model.User;

/**
 * Created by Zver on 25.02.2018.
 */


public interface DataBase {

    boolean insertUser(User user);
    User findUserByNick(String userNick);
}
