package day07_scanner;

public class LeapYear {
    public static void main(String[] args) {
        /**declare and assign a year variable
         check if the year is a leap year, a year will be a leap year if it is divisible by 4
         *
         */
       int year = 2024;
       boolean isLeapYar = year % 4 ==0;
        System.out.println("isLeapYar = " + isLeapYar);

    }
}
