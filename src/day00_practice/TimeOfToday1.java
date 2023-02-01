package day00_practice;


import java.util.Scanner;

public class TimeOfToday1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create an int value for the time of the day. Use a 24 hour format
        //use the given time of day to display a message
        //hint: use separate if statements
        //
        //	if the hours are from 6 - 11, print: Good morning
        //	if the hours are from 12 - 16, print: Good evening
        //	if the hours are from 17 - 23 or 0 - 5, print: Good night

        int time = 24;
        System.out.println("Enter your Hours:");
        String firstHour = input.nextLine();




 if (time >= 6 && time <= 11) {
     System.out.println("Good morning");
 }
 else if (time >= 12 && time <=16){
     System.out.println("Good Evening");
 }
 else if  (time >= 17 && time <= 23) {
         System.out.println("Good Night");
     }else if (time >=0 && time <=5) {



         }
 }


         }





