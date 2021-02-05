package com.series;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Theater theatre = new Theater("Olympian", 8, 12);
//        if(theatre.reserveSeat("A02")) {
//            System.out.println("Please pay for A02");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//        if(theatre.reserveSeat("A02")) {
//            System.out.println("Please pay for A02");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//        if(theatre.reserveSeat("B13")) {
//            System.out.println("Please pay for B13");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//
//        List<Theater.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
//        Collections.reverse(reverseSeats);
//        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=======================================================================");
    }
}
