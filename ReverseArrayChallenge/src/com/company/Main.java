package com.company;

import java.util.Arrays;

public class Main {

    public static void reverse(int[] arr) {
        int half = arr.length / 2;
        for(int i = 0; i < half; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
