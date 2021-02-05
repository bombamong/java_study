package com.series;

public class Main {

    public static void main(String[] args) {
	    int x = 90;
	    int y = 0;
        System.out.println(divideBYL(x, y));
        System.out.println(divideEAFP(x, y));
    }

    private static int divideBYL(int x, int y) {
        if(y != 0) {
            return x /y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(Exception e) {
            System.out.println(e.getClass().toString());
            return 0;
        }
    }
}
