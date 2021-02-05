package com.series;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for(int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int fibonacci(int n) {
        if(n < 2) return n;
        else return fibonacci((n - 1)) + fibonacci((n - 2));
    }
}
