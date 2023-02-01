package day00_practice;

import java.util.Scanner;

public class AmOrPm {
    public static void main(String[] args) {

        //1. WRITE YOUR CODE HERE:
        int hour, minutes, seconds;
        String amOrPm="";

        //DO NOT TOUCH BELOW LINES.
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:
        System.out.println("Enter your time");
        if(hour>=0 && hour<=12) {
            System.out.println(hour+ ":"+minutes+ ":"+seconds);
        }


    }
}
