package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    int sum = 0;
        Scanner scanner = new Scanner(System.in);
	    while(count <= 10){
	        System.out.print("Enter number #" + count + ": ");
	        boolean isInt = scanner.hasNextInt();
	        if(isInt){
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }
	    scanner.close();
	    System.out.println("Sum is " + sum);
    }
}
