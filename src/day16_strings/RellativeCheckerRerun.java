package day16_strings;

import java.util.Scanner;

public class RellativeCheckerRerun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  your full name: ");
        String fullName1 = input.nextLine();
        System.out.println("Please enter the full name of a person you want to check for relatedness with you: ");
        String fullName2 = input.nextLine();

        int lastName1Index = fullName1.indexOf(' ') + 1;
        int lastName2Index = fullName2.indexOf(' ') + 1;
        if (fullName1.substring(lastName1Index).equalsIgnoreCase(fullName2.substring(lastName2Index))) {
            System.out.println("related");
        } else {
            System.out.println("Not related");
        }
    }
}
