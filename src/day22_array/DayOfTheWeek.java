package day22_array;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {


        /*Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

        1 - Monday
        2 - Tuesday
    ...
        7 - Sunday

        Use array, not if statement or switch
         */

        Scanner input = new Scanner(System.in);

        String [] months = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter the day of the week number");
        int num = input.nextInt();

        if(num >= 1 && num <= 7){ // valid months from 1-12
            System.out.println(months[num - 1]); // to convert the input number to a month index we can subtract by 1 which means if the number was 1 --> 1 - 1 = 0 which means index 0 value will be returned
        } else {
            System.out.println("Invalid month number. Should be 1-7");
        }

    }
}

