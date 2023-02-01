package day41_exception;

import java.util.Scanner;

public class Throw_vs_Throws {
    public static void main(String[] args) {
        System.out.println("Enter your score");
        int score = new Scanner(System.in).nextInt();

        if (score <0|| score >10){
            throw new RuntimeException("Invalid score:"+score);

        }
if (score >=90);
        System.out.println("A"); // only if condition is right. """"trow!!!"""" it is like precondition

// enter -25
//Exception in thread "main" java.lang.RuntimeException: Invalid score:-25
//	at day41_exception.Throw_vs_Throws.main(Throw_vs_Throws.java:11)
//
//Process finished with exit code 1




    }
    public static void method1() throws java.lang.InterruptedException {
        Thread.sleep(5000); //handle it
    }

    private static class InterruptedException extends Exception {
    }
}
