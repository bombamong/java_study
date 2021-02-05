package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will help you sort numbers");
        System.out.print("How many numbers would you like to sort? : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Please enter number #" + i + 1 + ": ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return numbers;
    }

    public static void printArray(int[] numbers) {
        System.out.println("These are the numbers in the array");
        System.out.println("----------------------------------");
        for(int num : numbers){
            System.out.println(num);
        }
        System.out.println("----------------------------------");
    }

    public static int[] sortArray(int[] numbers) {
        System.out.println("[Sorting array in descending order...]");
        int[] sorted = numbers.clone();
        for(int i = 0; i < sorted.length; i++) {
            for(int j = 0; j < sorted.length; j++) {
                if(sorted[i] > sorted[j]){
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        System.out.println("[Array sorted!]");
        return sorted;
    }

    public static void main(String[] args) {
        int[] numbers = getIntegers();
        printArray(numbers);
        int[] sortedNumbers = sortArray(numbers);
        printArray(sortedNumbers);
    }
}
