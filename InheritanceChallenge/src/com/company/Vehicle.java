package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle steering at " + currentDirection);
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle moves at " + currentVelocity);
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
