package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("DOG CHEWS FOOD");
    }

    @Override
    public void eat(){
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("DOG WALKS");
        super.move(5);
    }

    public void run(){
        System.out.println("DOG RUNS!");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("DOG MOVES LEGS");
    }

    @Override
    public void move(int speed){
        System.out.println("DOG MOVES");
        moveLegs(speed);
        super.move(speed);
    }
}
