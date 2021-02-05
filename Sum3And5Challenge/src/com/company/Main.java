package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
	    for(int x = 1; x <= 1000; x++) {
	        if(x % 3 == 0 && x % 5 == 0) {
                sum += x;
                count++;
                System.out.println("Found number = " + x);
            }
	        if(count >= 5) break;
        }
        System.out.println("Sum = " + sum);
    }
}
