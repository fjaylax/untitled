package day07_scanner;
import java.util.Scanner;
public class IsDivisiblePractice {
    public static void main(String[] args) {
/**   Enter a number
 65

 65 is divisible by 2: false
 65 is divisible by 3: false
 65 is divisible by 5: true
 */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        boolean isDivisibleBy2 = (65 % 2 == 0);
        boolean isDivisibleBy3 = (65 % 2 == 0);
        boolean isDivisibleBy5 = (65 % 5 == 0);

        System.out.println("65 is divisible by 2: "+isDivisibleBy2);
        System.out.println("65 is divisible by 3: "+isDivisibleBy3);
        System.out.println("65 is divisible by 5: "+isDivisibleBy5);



    }
}
