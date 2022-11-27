package com.revature.utils;

import com.revature.controller.HeroController;

import io.javalin.Javalin;

/***
 * Used for setting up the paths for my server
 * 
 */
public class Router {
    public static void setUpEndPoints(Javalin app) {
        // everytime we get a get request on our ip, with this path
        // we'll say hello
        // If we send a request to ip_address:7000/hello
        // whenever the server, receives a get request to the /hello url
        // we're going to do what the lambda expression has written out
        app.get("/hello", HeroController.sayHello());
        app.get("/heroes", HeroController.getHeroes());
        app.post("/heroes", HeroController.addHero());
        // how do you create a method that gets a hero by their name??
        app.get("/heroes/{name}", ctx -> ctx.result("To be developed"));
    }
}
