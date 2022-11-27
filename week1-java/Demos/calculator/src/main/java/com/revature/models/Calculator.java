package com.revature.models;

public final class Calculator {
    static {
        System.out.println("Executing static block");
    }

    public static String field;

    public int add(int x, int y) {
        return x + y;
    }
}
