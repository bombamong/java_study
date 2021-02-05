package com.company;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear();
        } else if(newVelocity > 10 && newVelocity <= 20) {

        } else if(newVelocity > 20 && newVelocity <= 30) {

        } else if(newVelocity > 30 && newVelocity <= 40) {

        }
    }


}
