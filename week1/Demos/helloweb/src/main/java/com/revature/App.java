package com.revature;

import com.revature.utils.Router;

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
        Router.setUpEndPoints(app);
    }
}
