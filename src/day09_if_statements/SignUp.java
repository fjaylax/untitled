package day09_if_statements;

import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*sign up newspaper

         */
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter email");
        String email = input.nextLine();


        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Do you want to sign for extra newsletter T/F");
        boolean extra = input.nextBoolean();

        System.out.println("How did you hear about us?");
        input.nextLine();// take the enter grom the nextBoollean input
        String hearAboutUs = input.nextLine();

       String confirm = fullName + " you signed up! with email:" +email + " . We are glad to get readers at age: '"+age+" . You sighted up for extra newsletter:" +extra+ ". Credit goes to "+hearAboutUs;
        System.out.println(confirm);




    }
}
