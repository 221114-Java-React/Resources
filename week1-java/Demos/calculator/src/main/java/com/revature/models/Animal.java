package com.revature.models;

public abstract class Animal {
    protected String name;
    protected String fur;

    public Animal() {
        this.name = "Aurynie";
        this.fur = "grey";
    }

    public String getName() {
        return name;
    }

    public String getFur() {
        return fur;
    }
}
