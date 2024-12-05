package com.example.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        // Loosely coupled; We can change the engine type easily
       UserDataProvider userDataProvider = new UserDatabaseProvider();
       UserManager userManagerWithDB = new UserManager(userDataProvider);
       System.out.println(userManagerWithDB.getUserInfo());

       // Loosely coupled
        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebServiceDB = new UserManager(webServiceDataProvider);
        System.out.println(userManagerWithWebServiceDB.getUserInfo());

    }
}
