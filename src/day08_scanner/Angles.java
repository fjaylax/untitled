package day08_scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter three number: ");
        double angleOne = input.nextDouble();
        double angleOTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double sum = angleOne + angleOTwo + angleThree;
        boolean isTriangle = sum == 180;
        boolean IsCircle = sum == 360;

        System.out.println("IsTriangle = " +isTriangle);
        System.out.println("IsCircle = " + IsCircle);




    }
}
