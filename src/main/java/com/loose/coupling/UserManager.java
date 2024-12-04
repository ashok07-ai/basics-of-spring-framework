package com.loose.coupling;

public class UserManager {
   private final UserDataProvider userDataProvider;

   // Injection dependency via constructor
   public UserManager(UserDataProvider userDataProvider){
       this.userDataProvider = userDataProvider;
   }

    public String getUserInfo(){
    return userDataProvider.getUserDetails();
    }
}
