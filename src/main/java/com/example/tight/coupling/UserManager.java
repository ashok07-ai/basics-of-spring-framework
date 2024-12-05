package com.example.tight.coupling;

public class UserManager {
    // The UserManager class directly creates an instance of UserDatabase class
    // This creates tight coupling between UserManager and UserDatabase
    private final UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo(){
    return userDatabase.getUserDetails();
    }
}
