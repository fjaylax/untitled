package day16_strings;

import java.util.Locale;
import java.util.Scanner;

public class FixNames {
    public static void main(String[] args) {
        /*
        enter first name
        enrer last name
        print proper with capitals first

         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName=input.nextLine();
        System.out.println("enter your last name");
        String lasttName=input.nextLine();
        firstName=firstName.toLowerCase();
        lasttName=lasttName.toLowerCase();
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lasttName=lasttName.substring(0,1).toUpperCase()+lasttName.substring(1);

        System.out.println(firstName);
        System.out.println(lasttName);








    }

}
