package day00_practice;

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        /*
        // give 1 dollar and you get back change
        // change will be in quarters, dimes, nickles, pennies

        int money = 65; // where 100 is 1 dollar
        int quarter = money / 25;
        money %= 25; // money = money % 25;
        int dimes = money / 10;
        money %= 10;
        int nickles = money / 5;
        money %= 5;
        int pennies = money;

        System.out.println("Change:");
        System.out.println(quarter + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds");
        int inputSeconds = input.nextInt();



        int hours = inputSeconds / 3600;
        inputSeconds %=3600;
        int minutes = inputSeconds/60;
        inputSeconds %=60;
        int seconds =inputSeconds;




        System.out.println( + hours + " hours, "  +minutes+ " minutes, and "+seconds+ " seconds");





    }
}
