package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.Resolver;

public class UsersResolvers implements Resolver {
    @Override
    public void resolve() {
        System.out.println("This is the Users one");
    }
}
