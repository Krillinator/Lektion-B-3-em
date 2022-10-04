package com.krillinator.demo;

import static com.krillinator.demo.Col.*;

public class Main {
    public static void main(String[] args) {

        Cat kasper = new Cat();
        Dog bjork = new Dog();

        kasper.eat();
        kasper.makeSound();
        kasper.sleep();
        kasper.excrete(); // Default method

        bjork.eat();
        bjork.makeSound();
        bjork.sleep();
        bjork.excrete(); // Default method

        // "\033[0;31m";

        String name = "benny";

        System.out.println(RED + " Hello " + RESET + " World! ");
        System.out.println(BLUE + " I'm blue " + RESET + " Yea ");

        System.out.printf("I'm %s " +
                "blue %s " +
                "and I am %s " +
                "Green %s", BLUE, RESET, GREEN, name);

    }
}
