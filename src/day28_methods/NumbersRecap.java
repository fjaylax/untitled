package day28_methods;

import java.util.Scanner;

public class NumbersRecap {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);// use scanner

        checkNum(input.nextInt());


    }
    public static void checkNum (int n){
        if (n>0){
            System.out.println("positive");
        }else if (n<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }




    }






}
