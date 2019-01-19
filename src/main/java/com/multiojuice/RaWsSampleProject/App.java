package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.RaWsApp;
import com.multiojuice.RaWsFramework.Resolver;
import com.multiojuice.RaWsFramework.HTTPMethodsResolver;

import java.util.HashMap;

public class App {
    public static void main( String[] args ) {
        RaWsApp app = new RaWsApp();
        HashMap<String, Resolver> endpoints = app.getEndpoints();
        HTTPMethodsResolver usersMethodsResolver = new HTTPMethodsResolver();

        UserGetResolver userGetResolver = new UserGetResolver();
        usersMethodsResolver.setGetResolver(userGetResolver);

        endpoints.put("/users", usersMethodsResolver);
        app.start();
        System.out.println("past run");
    }
}
