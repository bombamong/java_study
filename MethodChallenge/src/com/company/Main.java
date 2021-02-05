package com.company;

public class Main {

    private static void displayHighScorePosition(String playerName, int position){
        System.out.println(
                 playerName + " managed to get into position " + position
        );
    }

    private static int calculateHighScorePosition(int score){
//        int answer = 4;
//        if(score >= 1000) answer = 1;
//        else if(score >= 500) answer = 2;
//        else if(score >= 100) answer = 3;
//        return answer;
        return score >= 1000 ? 1 : score >= 500 ? 2 : score >= 100 ? 3 : 4;
    }

    public static void main(String[] args) {
        int[] scores = {1500, 900, 400, 50};

        for(int score : scores){
           displayHighScorePosition("someone", calculateHighScorePosition(score));
        }

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int answer = (int) (num1 * 1000) - (int) (num2 * 1000);
        if(answer == 0) return true;
        return false;
    }
}
