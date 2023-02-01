package day18_loops;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("bot is awake");
        while (run) {
            System.out.println("Enter you message");
            String msg = input.nextLine().toLowerCase();
            switch (msg) {
                case "hello":
                    System.out.println("how are you?");
                    break;
                case "what is your age":
                    System.out.println("I was programmed in July");
                    break;
                case "what do you like":
                    System.out.println("I like java");
                    break;
                default:
                    System.out.println("Sorry, i did not get that");
                    break;
                case "shut down":
                    System.out.println("SHUTTING DOWN");
                    run = false;// stop booloen from run forever



            }


        }
    }
}
