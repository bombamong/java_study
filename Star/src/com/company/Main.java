package com.company;

public class Main {

    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else {
            for(int row = 0; row < number; row++){
                String line = "";
                for(int col = 0; col < number; col++){
                    if(row == 0 || col == 0) line += "*";
                    else if(row == number -1 || col == number - 1) line += "*";
                         else if(row == col) line += "*";
                         else if(number - 1 - row == col) line += "*";
                    else line += " ";
                }
                System.out.print(line + "\n");
            }
        }
    }

    public static void main(String[] args) {
	    printSquareStar(8);
    }
}
