package com.woodman.androidstart.DAO;



import com.woodman.androidstart.Interface.DataBase;
import com.woodman.androidstart.Model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zver on 25.02.2018.
 */

public class CollectionDataBase implements DataBase {
    private static CollectionDataBase collectionDataBase = new CollectionDataBase();

    private List<User> userList;

    private CollectionDataBase() {
        userList = new LinkedList<>();
    }

    public static CollectionDataBase getInstance() {
        return collectionDataBase;
    }

    @Override
    public boolean insertUser(User user) {
        return userList.add(user);
    }

    @Override
    public User findUserByNick(String userNick) {
        for (User user : userList
                ) {
            if (user.getNick() == userNick) {
                return user;
            }
        }
        return null;
    }


}
