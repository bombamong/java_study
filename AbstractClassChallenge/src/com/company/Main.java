package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();
        String[] array = "aaaaabcdefghijklmnopqrstuvwxyz".split("");

        for(int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
        for(String el : array) {
            ComparableListNode newNode = new ComparableListNode(el);
            list.add(newNode);
        }
//        System.out.println(list.getHead().getValue());
//        System.out.println(list.getHead().getValue());
        list.printList();

        list.remove("a");
        list.remove("z");
        list.remove("x");
        list.remove("b");

        list.printList();
    }
}
