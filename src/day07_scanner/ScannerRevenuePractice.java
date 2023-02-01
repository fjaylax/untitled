package day07_scanner;
import  java.util.Scanner;

public class ScannerRevenuePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       //  Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
        System.out.println("Enter the price: ");
        int price = input.nextInt();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        int revenue = price * quantity;
        System.out.println("Your revenue : "+revenue);



    }
}
