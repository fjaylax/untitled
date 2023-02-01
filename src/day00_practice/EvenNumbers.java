package day00_practice;

public class EvenNumbers {
    public static void main(String[] args) {
        int numbers = 30;
        for (int i = 0; i <= 30; i++) {


            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd numbers: " +i);

            }
        }
    }
}
