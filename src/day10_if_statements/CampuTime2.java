package day10_if_statements;

import java.util.Scanner;

public class CampuTime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time from 0-23 in 24H format, where is 0 is Midnight");
        int time = input.nextInt();
        String message = " "; //declaring and assigning a string with value empty space "" default starting value

//TODO finish


            if(time >= 6 && time <= 11){
                message = ("Good morning");
            } else if(time >= 12 && time <= 16){
                message = ("Good evening");
            } else if((time >= 17 && time <= 23) || (time >= 0 && time <= 5)){
                message =("Good night");
            } else {
                message = ("Not in 24h range");
            }


        }
    }





