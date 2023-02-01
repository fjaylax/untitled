package day10_if_statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter month number from 1-12");
        int month = input.nextInt();
        int day = 0;
        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        if (has31Days) {
            day = 31;
        } else if (has30Days) {
            day = 30;
        } else if (month == 2) {

        }
        // determine the output of my programm
        if (day > 0) {
            System.out.println("month :" + month);
            System.out.println("Days in month: " + day);
        } else {
            System.out.println(month + "Is not valid number");
        }
    }
}
