package day16_strings;

import java.util.Scanner;

public class CheckIfRelatedPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st person  name");
        String name1FirstName = input.next();
        String name1LastName = input.next();
        //(item.equals(item2));

        System.out.println("Enter 2nd person name");
        String name2FirstName = input.next();
        String name2LastName = input.next();
        if (name1LastName.equals(name2LastName)) {
        System.out.println("Related");
    }else {
            System.out.println("Not related");


        }



    }

}
