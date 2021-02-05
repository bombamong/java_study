package com.company;

import java.util.Scanner;

public class Main {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int nextNumber = scanner.nextInt();
                count++;
                sum += nextNumber;
                average = Math.round((double) sum / (double) count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        scanner.close();

    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int maxNumber = Integer.MIN_VALUE;
//        int minNumber = Integer.MAX_VALUE;
//        while(true){
//            System.out.print("Enter number: ");
//            boolean isInt = scanner.hasNextInt();
//            if(isInt) {
//                int newNumber = scanner.nextInt();
//                maxNumber = newNumber > maxNumber ? newNumber : maxNumber;
//                minNumber = newNumber < minNumber ? newNumber : minNumber;
////                System.out.println("Min is : " + minNumber);
////                System.out.println("Max is : " + maxNumber);
//            } else {
//                System.out.println("Invalid Input");
//                System.out.println("Min is : " + minNumber);
//                System.out.println("Max is : " + maxNumber);
//                break;
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
            inputThenPrintSumAndAverage();

    }
}
