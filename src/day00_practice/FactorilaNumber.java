package day00_practice;

import java.util.Scanner;

public class FactorilaNumber {
    public static void main(String[] args) {
        /*
        /* write a program that calculates the factorial of a number:
        ex: 5! = 5 * 4 * 3 * 2 * 1 = 120 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

int Fact =1;
        for (int i = 1; i <=number ; i++) {
            Fact=i*Fact;



        }
        System.out.println(Fact);
    }



}
