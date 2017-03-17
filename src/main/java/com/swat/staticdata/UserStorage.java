package com.swat.staticdata;

import com.swat.data.UserData;

/**
 * Created by paul on 17.03.17.
 */
public class UserStorage {
    public static final UserData userForRegistration = new UserData("First", "Last", "test1@test1.test1", "111111", "+380501234567", "21", "май", "1950", "female");
    public static final UserData userForLogin = new UserData("test1@test1.test1", "111111");
    public static final UserData email = new UserData("test1@test1.test1");
}
