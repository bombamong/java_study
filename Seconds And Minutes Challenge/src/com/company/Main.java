package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    private static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds >= 60)
            return INVALID_VALUE_MESSAGE;
        String sHours =  Integer.toString(minutes / 60);
        String sMinutes = Integer.toString(minutes % 60);
        String sSeconds = Integer.toString(seconds);

        String[] times = {sHours, sMinutes, sSeconds};
        for(int x = 0; x < times.length; x++){
            if(times[x].length() < 2){
                times[x] = "0" + times[x];
            }
        }
        return times[0] + "h " + times[1] + "m " + times[2] + "s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 499));
        System.out.println(Math.PI);
    }
}
