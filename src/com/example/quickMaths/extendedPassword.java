package com.example.quickMaths;

import com.example.quickMaths.Password;

public class extendedPassword extends Password {

    private int decryptedPassword;

    public extendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }

}
