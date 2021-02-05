package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] readIntegers(int count) {
        int[] newArray = new int[count];
        for(int i = 0; i < newArray.length; i++) {
            System.out.print("Please enter number #" + (i + 1) + " : ");
            newArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Your new array is " + Arrays.toString(newArray));
        System.out.println("---------------------------");
        return newArray;
    }

    private static int findMin(int[] array) {
        System.out.println("Finding min...");
        int min = array[0];
        for(int num : array) {
            min = num < min ? num : min;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.print("Array length is : ");
        int arrayLength = scanner.nextInt();
        scanner.nextLine();
        int[] newArray = readIntegers(arrayLength);
        int min = findMin(newArray);
        System.out.println("min is " + min);
    }
}
