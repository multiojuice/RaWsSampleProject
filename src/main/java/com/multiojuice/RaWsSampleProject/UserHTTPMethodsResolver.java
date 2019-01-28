package com.multiojuice.RaWsSampleProject;


import com.multiojuice.RaWsFramework.Resolvers.HTTPMethodsResolver;

import java.io.PrintWriter;
import java.util.Date;

public class UserHTTPMethodsResolver extends HTTPMethodsResolver {
    @Override
    public void postResolve() {
        System.out.println("Got a post message for /users");
    }

    @Override
    public void getResolve() {
        PrintWriter out = this.getPrintWriter();

        out.println("HTTP/1.1 200 OK");
        out.println("Server: RaWs");
        out.println("Date: " + new Date());
        out.println(); // blank line between headers and content, very important !
        out.flush(); // flush character output stream buffer

        System.out.println("Got a get message for /users");
    }
}
