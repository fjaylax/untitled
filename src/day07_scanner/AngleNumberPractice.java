package day07_scanner;
import java.util.Scanner;

public class AngleNumberPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
         Determine if the angles make a triangle, which means the angles add to 180.0
         and
         Determine if the angles make a circle, which means the angles add to 360.0

         */

        System.out.println("Enter angle 1st number:");
                 int num1 = input.nextInt();
        System.out.println("num1 = " + num1);

        System.out.println("Enter angle 2nd number:");
        int num2 = input.nextInt();
        System.out.println("num2 = " + num2);

        System.out.println("Enter angle 3rd number:");
        int num3 = input.nextInt();
        System.out.println("num3 = " + num1);

        boolean isIttrueOutput180 =  (num1 + num2 + num3 == 180);
        System.out.println("is angles make triangle: " +isIttrueOutput180);

        boolean isItTrueOutPut360 = (num1+num2 + num3 == 360);
        System.out.println(" is angles make circle: " +isItTrueOutPut360);

    }
}
