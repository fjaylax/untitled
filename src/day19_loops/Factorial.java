package day19_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(); // something new for input
        int factorial = 1;
        String msg= num+ "! = ";
        for (int i = num; i > 1; i--) {
            factorial *= i;
            msg += i + " * ";

        }

msg+= "1 = " +factorial;
        System.out.println(factorial);
        System.out.println(msg);
    }
}

