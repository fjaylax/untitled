package day08_scanner;


import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item name");
        String item = input.nextLine();


        System.out.println("What is the price");
        double price = 5.99;
        System.out.println(price);
        System.out.println("How many "+item+"/s do u need?");
        int quantity = input.nextInt();

         double total = price * quantity;
        System.out.println("Your total will be : $"+total);




    }
}


