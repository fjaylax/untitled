package day00_practice;

public class OtherMethods {
    /*
    ------------------------------------------------------------------------

create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
------------------------------------------------------------------------

create a method that will accept a number. Find and print if it is a positive number, negative number, or zero

------------------------------------------------------------------------

create a method that accepts a String and print each character of the String on a separate line

     */
    public static void main(String[] args) {

        ageChecker(18);
        ageChecker(12);

        System.out.println("------------------");

        checkTheNumber(12);
        checkTheNumber(-134.65f);
        checkTheNumber(-1204985943859438598777777777777777777779438598345984935.34456456546546);
        checkTheNumber(0);

        System.out.println("------------------");

        eachCharacter("Hello World");

    }

    //    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
    public static void ageChecker(int age) {

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Подрасти немного )))");
        }
    }

    //    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
    public static void  checkTheNumber(double num) {

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Equal 0");
        }
    }


    //    create a method that accepts a String and print each character of the String on a separate line
    public static void  eachCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}