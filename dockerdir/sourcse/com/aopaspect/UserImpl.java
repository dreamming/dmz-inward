package com.aopaspect;

import com.aopi.User;

/**
 * Created by dmz on 2016/2/2.
 */
public class UserImpl implements User {
    public void delete(String name) {
        System.out.println("delete ...."+name);
    }

    public void add() {
        System.out.println("add ....");
    }
}
