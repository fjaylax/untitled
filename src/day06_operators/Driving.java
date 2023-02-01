package day06_operators;

public class Driving {
    public static void main(String[] args) {

        int speedMy = 50;
                 int speedLimit = 50;

        boolean isSpeeding = speedMy >= speedLimit;
        System.out.println("Is speeding:" + isSpeeding);

        /* declare a number variable
        find out if number is positive, negative or zero

         */

int number = -4;
boolean isPositive = number > 0;
boolean isNegative = number < 0;
boolean isZero = number == 0;

        System.out.println(isPositive);
        System.out.println(isNegative);
        System.out.println(isZero);

        /* define number
 find out if it is even
  */
        int number2 = 10;
        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 != 0;
        System.out.println(isEven);
        System.out.println(isOdd);
        System.out.println("isOdd = " + isOdd);
        System.out.println("isEven = " + isEven);




    }

}
