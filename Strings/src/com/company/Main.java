package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
//        String myString = "This is a string";
//        myString += ", a;slkdjf;laksjdf";
//        System.out.println(myString);
//        String numberString = "250.55";
//
//        int a = 100;

        double myDouble = 20.00d;
        double myDouble2 = 80.00d;
        double result = myDouble + myDouble2;
        result *= 100;
        double remainder = result % 40.00d;

        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);

        if(isZero == false){
            System.out.println("Got some remainder");
        }


    }
}
