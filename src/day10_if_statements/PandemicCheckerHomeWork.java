package day10_if_statements;


import java.util.Scanner;

public class PandemicCheckerHomeWork {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = input.nextInt();


        String message = "";
        if (year >= 1346 && year <= 1353) {
            message = ("The Black Death");
        } else if (year >= 1665 && year <= 1666) {
            message = ("Great Plague of London");
        } else if (year >= 1770 && year <= 1772) {
            message = ("Russian plague");
        } else if (year >= 1889 && year <= 1890) {
            message = ("Flu pandemic");
        } else if (year == 1916) {
            message = ("American polio epidemic");
        } else if (year >= 1918 && year <= 1920) {
            message = ("Spanish flu");
        } else if (year >= 2009 && year <= 2010) {
            message = ("H1N1 Swine Flu Pandemic");
        } else if (year >= 2019 && year <= 2021) {
            message = ("COVID-19");
        } else {
            message = ("No Pandemic");

        }
        System.out.println(message);
    }
}