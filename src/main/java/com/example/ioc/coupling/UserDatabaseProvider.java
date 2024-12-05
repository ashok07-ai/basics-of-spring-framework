package com.example.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        // Directly access database here
        return "User details from database";
    }
}
