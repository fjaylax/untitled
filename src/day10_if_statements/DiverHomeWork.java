package day10_if_statements;

import java.util.Scanner;

public class DiverHomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 90;

        System.out.println("Enter you oxygen level:");
        int level = scan.nextInt();

        if (level >= 90){
            System.out.println("Your tank is full");
        }else if (level >= 80){
            System.out.println("You are still OK");
        }else if (level >= 70){
            System.out.println("Dont' go too far");
        }else if (level >= 60){
            System.out.println("Start to head back");
        }else if (level >=50){
            System.out.println("Be careful now at 50%");

        }
    }
}
