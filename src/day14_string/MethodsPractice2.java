package day14_string;

import java.util.Scanner;

public class MethodsPractice2 {
    public static void main(String[] args) {
       /*
       Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        System.out.println("Print in all lowercase: " +sentence.toLowerCase());
        System.out.println("remove extra space:" +sentence.trim());
        System.out.println("Your sentence is " +sentence.length()+" characters");





    }
}
