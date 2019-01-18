package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.RaWsApp;
import com.multiojuice.RaWsFramework.Resolver;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        RaWsApp app = new RaWsApp();
        HashMap<String, Resolver> endpoints = app.getEndpoints();
        UsersResolvers usersResolvers = new UsersResolvers();
        endpoints.put("/users", usersResolvers);
        app.start();
        System.out.println("past run");
    }
}
