package day12_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {

        int monthNumber=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter month number 1-12");
        monthNumber = input.nextInt();

        switch (monthNumber){
            case 12: case 1: case 2:
                System.out.println("It is winter, so wear winter coat, gloves and a hat");
                break;

            case 3: case 4: case 5:
                System.out.println("It is Spring. Light jacket might work");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer time: sorts and t-shirt will work! Sun glasses!");
                break;
            case 9: case 10: case 11:
                System.out.println("It is fall. Lots of rain and getting colder");
                break;
            default:
                System.out.println("invalid number.Only 1-12");
        }
    }
}
