package day15_strings;

import java.util.Scanner;

public class ReRunTitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name including your titles please");
        String a = input.nextLine();

        if(a.startsWith("Mr") || a.startsWith("Mister")||a.endsWith("Mr")||a.endsWith("Mister")){
            System.out.println("Hello Sir");
        }else if(a.startsWith("Ms") || a.startsWith("Miss")||a.endsWith("Ms")||a.endsWith("Miss")){
            System.out.println("Hello Ma'am ");
        }else if(a.startsWith("Dr")|| a.endsWith("Dr")){
            System.out.println("Hello Doctor ");
        }else if(a.startsWith("Sr") || a.endsWith("Sr")){
            System.out.println("Nice to meet you Senior ");
        }else if(a.startsWith("Jr") || a.endsWith("Jr")) {
            System.out.println("Nice to meet you Junior ");

        }



    }
}
