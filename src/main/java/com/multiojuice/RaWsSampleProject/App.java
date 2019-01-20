package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.RaWsApp;
import com.multiojuice.RaWsFramework.Resolver;
import com.multiojuice.RaWsFramework.HTTPMethodsResolver;

import java.util.HashMap;

public class App {
    public static void main( String[] args ) {
        RaWsApp app = new RaWsApp();
        HashMap<String, Resolver> endpoints = app.getEndpoints();
        UserHTTPMethodsResolver userHTTPMethodsResolver = new UserHTTPMethodsResolver();

        endpoints.put("/users", userHTTPMethodsResolver);
        app.start();
        System.out.println("past run");
    }
}
