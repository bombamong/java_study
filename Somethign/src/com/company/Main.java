package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] arr = new Person[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Person("Person#" + i);
        }
        for(Person p : arr) {
            System.out.println(p.getName());
        }
    }
}
