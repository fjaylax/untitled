package day17_string;

public class PrintLetters {
    public static void main(String[] args) {
        char first = 'A';
        while (first <= 'Z') {

            System.out.print(first++);
        }
        System.out.println();
        //printing z-a
        char backwards = 'z';
        while (backwards >= 'a') {

            System.out.print(backwards--);
        }
    }
}
