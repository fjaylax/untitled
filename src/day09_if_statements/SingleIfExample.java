package day09_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {
        if (true) {
            System.out.println("hhh"); //printing
        }
        System.out.println("break"); // normal print
        if (false) {
            System.out.println("fff"); //no print, because false
        }
        int year = 2020;
        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hand ");
            System.out.println("Social distance");


        }

        double price = 29.99;
        if (price >= 20) {
            System.out.println("Free shipping");

        }


    }


}
