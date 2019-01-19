package com.multiojuice.RaWsSampleProject;

import com.multiojuice.RaWsFramework.RequestType;
import com.multiojuice.RaWsFramework.Resolver;

public class UserGetResolver implements Resolver {
    @Override
    public void resolve(RequestType requestType) {
        System.out.println("This is the Users one");
    }
}
