package day15_strings;

import java.util.Scanner;

public class AddressRerunfromsom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full address");
        String address = input.nextLine();
        System.out.println(address.toUpperCase());



        boolean rightSide = address.startsWith("500");
        boolean leftSide = address.startsWith("600");


        if (rightSide){
            System.out.println("house on the right side");
        } else if (leftSide){
            System.out.println("house on the left side");
        }

        if (address.contains("drive")){
            System.out.println("house on drive");
        } else if (address.contains("lane")) {
            System.out.println("house on lane");
        } else if (address.contains("ave")){
            System.out.println("house on avenue");
        }

    }
}
