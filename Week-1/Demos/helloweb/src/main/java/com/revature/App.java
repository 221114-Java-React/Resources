package com.revature;

import io.javalin.Javalin;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // set up your server with javalin
        Javalin app = Javalin.create().start(7000);
        // everytime we get a get request on our ip, with this path
        // we'll say hello
        // If we send a request to ip_address:7000/hello
        // whenever the server, receives a get request to the /hello url
        // we're going to do what the lambda expression has written out
        app.get("/hello", ctx -> {
            ctx.result("Hello World!");
            ctx.status(418);
        });
    }
}
