package com.company;

public class Main {

//    public static void printDayOfTheWeek(int day){
//        String dDay;
//        switch(day){
//            case 0:
//                dDay = "Sunday";
//                break;
//            case 1:
//                dDay =  "Monday";
//                break;
//            case 2:
//                dDay = "Tuesday";
//                break;
//            case 3:
//                dDay = "Wednesday";
//                break;
//            case 4:
//                dDay = "Thursday";
//                break;
//            case 5:
//                dDay = "Friday";
//                break;
//            case 6:
//                dDay = "Saturday";
//                break;
//            default:
//                dDay ="Invalid Day";
//                break;
//        }
//        System.out.println(dDay);
//    }

    public static void printDayOfTheWeek(int day){
        String[] dDays = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };
        if(day >= 0 && day < dDays.length - 1){
            System.out.println(dDays[day]);
        } else System.out.println("Invalid Day");
    }



    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
