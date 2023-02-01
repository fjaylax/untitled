package day00_practice;

import java.util.Scanner;

public class ZombieReplit {
    public static void main(String[] args) {
        /*   There is a zombie disease pandemic wiping out populations. Use a loop to keep track of the city's population.
            The starting population is given as the inhabitants value. Each day the city is losing half of its population.
            Write the program that will show the population day by day, until the city gets to zero.
        Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings
       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of people");
        int inhabitants = scan.nextInt();


        int dayCount = 0;

        while ( inhabitants >= 1) {

            System.out.println("Day " + dayCount + "[" + inhabitants + "]");

            inhabitants /= 2;
            dayCount ++;

        }
        System.out.println("---- EXTINCT ----");


    }
}

