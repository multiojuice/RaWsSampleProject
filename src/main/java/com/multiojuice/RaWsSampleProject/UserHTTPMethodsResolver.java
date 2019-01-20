package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.HTTPMethodsResolver;

public class UserHTTPMethodsResolver extends HTTPMethodsResolver {
    @Override
    public void postResolve() {
        System.out.println("Got a post message for /users");
    }

    @Override
    public void getResolve() {
        System.out.println("Got a get message for /users");
    }
}
