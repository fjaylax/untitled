package day15_strings;

import java.util.Scanner;

public class TitleRunProgramm {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your name and a title:");
        String nameTitle = key.nextLine();

        String nameUpper = nameTitle.toLowerCase().trim(); // using trim to avoid space sensitivity
        if (nameUpper.startsWith("mister") || nameUpper.startsWith("mr")) {
            System.out.println("Hello sir");
        } else if (nameUpper.startsWith("ms") || nameUpper.startsWith("miss") || nameUpper.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameUpper.startsWith("dr")) {
            System.out.println("Hello Doctor");
        }
        if (nameUpper.endsWith("sr")) {
            System.out.println("Nice to meet you Senior");
        } else if (nameUpper.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        }


    }
}
