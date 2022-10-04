package com.krillinator.demo;

public class Dog implements IAnimal {


    @Override
    public void makeSound() {
        System.out.println("Bork bork");
    }

    @Override
    public void eat() {
        System.out.println(" Vacuum cleans it ");
    }

    @Override
    public void sleep() {
        System.out.println(" Living the life ");
    }
}
