package com.company;

public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 12)) return -1;;
        return (feet * 12 + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0 ) return -1;
        return calcFeetAndInchesToCentimeters(Math.floor(inches / 12), inches % 12);
    }

    public static void bark(String bark1){
        for(int x = 0; x < 10; x++){
            System.out.println(bark1);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(0));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        bark("guau");
    }



}
