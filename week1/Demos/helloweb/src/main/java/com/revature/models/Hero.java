package com.revature.models;

public class Hero {
    private String name;
    private String real_name;

    public Hero() {
        super();
    }

    public Hero(String name, String real_name) {
        this.name = name;
        this.real_name = real_name;
    }

    public String getName() {
        return name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", real_name=" + real_name + "]";
    }

}
