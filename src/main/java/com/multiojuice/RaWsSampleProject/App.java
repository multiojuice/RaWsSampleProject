package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.RaWsApp;
import com.multiojuice.RaWsFramework.Resolvers.Resolver;

import java.util.HashMap;

public class App {
    public static void main( String[] args ) {
        HashMap<String, Resolver> HTTPEndpoints = new HashMap<>();
        UserHTTPMethodsResolver userHTTPMethodsResolver = new UserHTTPMethodsResolver();

        HTTPEndpoints.put("/users", userHTTPMethodsResolver);

        RaWsApp app = new RaWsApp(HTTPEndpoints);
        app.start();
        System.out.println("past run");
    }
}
