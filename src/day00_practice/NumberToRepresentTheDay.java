package day00_practice;


import java.util.Scanner;

public class NumberToRepresentTheDay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mon1 = 1, tue2 = 2, wed3 = 3, thu4 = 4, fri5 = 5, sat6 = 6, sun7 = 7;
        System.out.println("Enter month number 1-12:");
        int weekDay = scan.nextInt();

        if (weekDay == 1){
            System.out.println("Monday");
        }else if (weekDay == 2){
            System.out.println("Tuesday");
        }else if (weekDay == 3){
            System.out.println("Wednesday");
        }else if (weekDay == 4){
            System.out.println("Thursday");
        }else if (weekDay == 5){
            System.out.println("Friday");
        }else if (weekDay == 6){
            System.out.println("Saturday");
        }else if (weekDay == 7){
            System.out.println("Sunday");
        }




    }
}