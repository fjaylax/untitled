package day00_practice;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {

        int time = 24;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your beginning hours:");
        int num1 = input.nextInt();

        System.out.println("Enter your end hours:");
        int num2 = input.nextInt();



        if (time >= 6 && time <= 11) {
            input.nextLine();

         System.out.println("Good Morning");
            String goodM = input.nextLine();

        } else if (time >= 12 && time <= 16){
            String goodE = input.nextLine();
        System.out.println("Good Evening");


        } else if (time >= 17 && time <= 23){
            String goodN = input.nextLine();
        System.out.println("Good night");

        } else if  (time >= 0 && time <= 5) {
            String goodN = input.nextLine();
            System.out.println("Good Night");
        }
    }
}



