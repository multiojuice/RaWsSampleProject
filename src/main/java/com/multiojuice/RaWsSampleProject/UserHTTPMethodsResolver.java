package com.multiojuice.RaWsSampleProject;


import com.multiojuice.RaWsFramework.Resolvers.HTTPMethodsResolver;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class UserHTTPMethodsResolver extends HTTPMethodsResolver {
    @Override
    public void postResolve() {
        System.out.println("Got a post message for /users");
    }

    @Override
    public void getResolve() {
        Socket socket = this.getSocket();
        try {
            OutputStream theOutput = socket.getOutputStream();
            // no auto-flushing
            PrintWriter pw = new PrintWriter(theOutput, false);
            // native line endings are uncertain so add them manually
            pw.print("HTTP/1.0 200 OK\r\n");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Got a get message for /users");
    }
}
