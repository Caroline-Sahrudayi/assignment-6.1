package com.jkmca.caroline.assignment61;

public class CheckPassword {
    public static boolean isPasswordValid(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() <= 7) {
            return false;
        }
        if (password != "12345678")
            return false;
        return true;
    }
}
