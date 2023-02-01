package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
/*
snacks 1,2,3
drinks 4,5,6
flow and combination
 */

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to vending machine.Select the menu you wan to see:\nSnacks \nDrinks");
        String menu = input.next();
        switch (menu) {
            case "Snacks":
                System.out.println("pick the snack:\n1)Chips 2)Cookie 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();
                if (snackOption == 1) {
                    System.out.println("Chips are selected");
                } else if (snackOption == 2) {
                    System.out.println("Cookies are selected");
                } else if (snackOption == 3) {
                    System.out.println("Pretzels dispensing");
                } else if (snackOption == 4) {
                    System.out.println("Cookies are my favorite");

                } else {
                    System.out.println();
                    System.out.println("not a valid number");
                }
                break;
            case "Drinks":
                System.out.println("Pick the drinks options: \n 1)Juce 2)Soda");
                int drinkOption = input.nextInt();
                if (drinkOption == 1) {
                    System.out.println("Giving juice");

                } else if (drinkOption == 2) {
                    System.out.println("Given soda");

                } else {
                    System.out.println("not a valid number");


                }
        }
    }
}