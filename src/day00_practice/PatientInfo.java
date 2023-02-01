package day00_practice;

import java.util.Scanner;

public class PatientInfo {
    public static  void main(String[] args) {
        String firstName, lastName, email, state, street, city = "";
        int age, zipCode = 0;
        double height, weight = 0;
        boolean isMarried = true;
        long workPhoneNumber, personalPhoneNumber = 0;
        Scanner scan = new Scanner(System.in);

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city

        System.out.println("Enter your city");
        city=scan.nextLine();
        System.out.println("Enter your state");
        state=scan.nextLine();
        System.out.println("Enter your zip code");
        zipCode=scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scan.nextLong();
        System.out.println("Enter your age");
        age=scan.nextInt();
        System.out.println("Enter your height");
        height=scan.nextDouble();
        System.out.println("Enter your weight");
        weight=scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = true;
        System.out.println("true");

        System.out.println("Welcome to the patient portal");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
    firstName=scan.nextLine();
        System.out.println("Enter your last name");
        lastName=scan.nextLine();
String fullReport = ("Patient Personal Information \nFull Name:"+firstName+ ""+lastName+ "\nAddress: "+street+", "+city+", "+state+" "+zipCode+
        "\nContact: work phone number: "+workPhoneNumber+" , personal phone number:" +personalPhoneNumber+" ,\nemail: "+email+" \nAge: "+age+" " +
        "\nHeight: "+height+"\n Weight: " +weight+" pounds \nMarried:" +isMarried);
        System.out.println(fullReport);

    }

}



