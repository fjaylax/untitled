package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Print first name");
        String firstName = input.next();
        System.out.println("Print last name");
        String lastName = input.next();

        System.out.println();
        System.out.println("Please enter your address");
        String address = input.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);

    }
}




