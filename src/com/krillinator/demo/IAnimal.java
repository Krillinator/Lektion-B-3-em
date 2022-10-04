package com.krillinator.demo;

public interface IAnimal {

    void makeSound();
    void eat();
    void sleep();

    default void excrete() {
        System.out.println(" It's happening... ");
    }

}
