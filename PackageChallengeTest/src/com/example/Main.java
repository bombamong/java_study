package com.example;
import com.series.Series;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println("nSum: " + Series.nSum(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println("factorial: " + Series.factorial(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println("fibonnaci: " + Series.fibonacci(i));
        }
    }
}


