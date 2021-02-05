package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        
        int myTotal = (myMinIntValue / 2);

        byte myNewByteVale = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        byte myByte = 1;
        short myShort = 12312;
        int number = 123123123;
        long veryLong = 50_000 + (10 * (myByte + myShort + number));
        System.out.println(veryLong);
    }
}
