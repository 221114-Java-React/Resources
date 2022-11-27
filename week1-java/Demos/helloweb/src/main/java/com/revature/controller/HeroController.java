package com.revature.controller;

import java.util.ArrayList;

import com.revature.models.Hero;

import io.javalin.http.Handler;

// Class that holds logic meant to process http requests
public class HeroController {
    // temporary storage
    public static ArrayList<Hero> heroes;
    static {
        // static block so that dummy data is loaded in my list of heroes
        heroes = new ArrayList<>();
        heroes.add(new Hero("Ping", "Mulan"));
        heroes.add(new Hero("Spider-man", "Peter Parker"));
        heroes.add(new Hero("Batman", "Bruce Wayne"));
        heroes.add(new Hero("One Punch Man", "Saitama"));
    }

    // for greetings
    public static Handler sayHello() {
        return ctx -> {
            ctx.result("Hello World!");
            ctx.status(418);
        };
    }

    // return a list of heroes
    public static Handler getHeroes() {
        return ctx -> {
            ctx.jsonStream(heroes);
        };
    }

    // add a hero to list
    public static Handler addHero() {
        return ctx -> {
            Hero newHero = ctx.bodyStreamAsClass(Hero.class);
            heroes.add(newHero);
            ctx.status(201);
        };
    }
}
