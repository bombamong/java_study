package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("bomba");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Paroto");
        parrot.fly();

        Penguin penguin = new Penguin("Tux");
        penguin.fly();
    }
}
