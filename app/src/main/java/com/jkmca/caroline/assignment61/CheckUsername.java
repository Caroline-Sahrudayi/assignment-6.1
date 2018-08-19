package com.jkmca.caroline.assignment61;

public class CheckUsername {
    public static boolean isUsernameValid(String username)
    {
        if(username == null){
            return false;
        }
        if (username != "paras")
            return false;
        return true;

    }
}
