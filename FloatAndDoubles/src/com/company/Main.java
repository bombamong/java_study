package com.company;

public class Main {

    public static double kgsToLbs(double kgs){
        double lbs = kgs * 2.22d;
        return lbs;
    }

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum = " + myMinFloatValue);
        System.out.println("Float maximum = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum = " + myMinDoubleValue);
        System.out.println("Double maximum = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println(kgsToLbs(60));
    }
}
