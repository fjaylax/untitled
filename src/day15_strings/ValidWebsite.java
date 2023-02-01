package day15_strings;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {




        Scanner input= new Scanner(System.in);
        System.out.println("Enter your website");
        String website = input.next();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com")|| website.endsWith(".gov")|| website.endsWith(".net")||website.endsWith(".edu");

        if (validStart &&validEnd) {
            System.out.println(website + " is valid");
        }else{
            System.out.println(website + " is not valid");
            if (!validStart) {
                System.out.println("Website has start with www.");
            }if (!validEnd){
                System.out.println("it has to end with .com or .edu or .net or .gov");

            }
        }

        System.out.println("______________");
        System.out.println(validStart && validEnd ? "Valid website" : "Invalid website");

    }
}
