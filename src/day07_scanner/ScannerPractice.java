package day07_scanner;

import  java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print 1st number:");
        int num1 = input.nextInt();
        System.out.println("Print 2nd number:");
        int num2 = input.nextInt();
        System.out.println("You 1st number is: " +num1);
        System.out.println("Your 2nd number is: " + num2);


    }

}
