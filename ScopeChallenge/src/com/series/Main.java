package com.series;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.io.PrintStream;

public class Main {

    private static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print('1');
        print("asdfs");
        print(123123);
        print(1.22);
        print(scanner);
    }


    private static void print(Object s) {
        System.out.print(s);
    }
    private static void println(Object s) {
        System.out.println(s);
    }
}
