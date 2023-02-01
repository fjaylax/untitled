package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /* [IQ]
        givving a number n
        print the uouput based on all conditions
        the number divvisiable by by 3 print Fizz
        the number divvisiable by by 5 print Buzz
        the number divvisiable by by 3 and 5 print FizzBuzz
        if the number is not divisible by any number just ptint this number
         n = 10
         Buzz

         n=12
         fizz

         n=13
         13
         n=15
         fixx buzz





        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        //int number = 15; hard code
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0){
            System.out.println("fizz");

    } else {
            System.out.println(number);
        }


    }

    }



