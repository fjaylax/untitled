package day08_scanner;
import java.util.Scanner;
public class AddNumber {
    public static void main(String[] args) {
         /* creat program that will as user to enter two number at them and print

          */
        Scanner input = new Scanner(System.in); //scanner object
        System.out.println("Print the number 1:");
        int  num1 =input.nextInt();


        System.out.println("Print the number 2:");
        int  num2 =input.nextInt();
        System.out.println(num1 + num2);



    }
}
