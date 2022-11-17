package com.revature;

import com.revature.models.Animal;
import com.revature.models.Calculator;
import com.revature.models.Cat;
import com.revature.models.Dog;

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
    public static final void main(String[] args) {
        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator.field = "Hello";
        System.out.println(calc.field);
        System.out.println(calc2.field);

        Animal auryn = new Cat();
        System.out.println(auryn.getName());
        Dog yibo = new Dog();
        System.out.println(yibo.getName());
    }
}
