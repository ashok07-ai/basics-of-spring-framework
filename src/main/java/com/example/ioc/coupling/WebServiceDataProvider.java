package com.example.ioc.coupling;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching data from web service..";
    }
}
