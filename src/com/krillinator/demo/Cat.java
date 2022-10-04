package com.krillinator.demo;

public class Cat implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println(" Nom nom nom");
    }

    @Override
    public void sleep() {
        System.out.println( "Zzzzz" );
    }
}
