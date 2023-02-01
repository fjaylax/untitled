package day00_practice;

public class CharacterMethods {
/*      - make method that will print all the letters from A to Z
            - make method that will print all the letters from a to z
            - make method that will print all the letters from Z to A
            - make method that will print all the letters from z to a
            - make method that will print all the letters from 0 to 9
     */

    public static void main(String[] args) {

        printChar('A', 'Z');

        System.out.println();

        printChar('a', 'z');

        System.out.println();

        printChar('1', '6');

        System.out.println();

        printChar('z', 'a');
    }



    public static void printChar(char from, char to ) {

        if (from < to) {
            for (int i = from; i <= to; i ++) {
                System.out.print("" + (char) i + " ");
            }
        } else {
            for (int i = from; i >= to; i --) {
                System.out.print("" + (char) i + " ");
            }

        }
    }


    public static void capitalLetters() {
        for (int i = 'A'; i <= 'Z' ; i++) {
            System.out.print("" + (char) i + " ");
        }
    }

    public static void lowerLetters() {
        for (int i = 'a'; i <= 'z' ; i++) {
            System.out.print("" + (char) i + " ");
        }
    }


    public static void capitalLettersReverse() {
        for (int i = 'Z'; i >= 'A' ; i--) {
            System.out.print("" + (char) i + " ");
        }
    }

    public static void lowerLettersReverse() {
        for (int i = 'z'; i >= 'a' ; i--) {
            System.out.print("" + (char) i + " ");
        }
    }

    public static void number() {
        for (int i = '0'; i <= '9' ; i++) {
            System.out.print("" + (char) i + " ");
        }
    }

}
