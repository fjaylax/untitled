package day06_operators;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println();

        char letter2 = 'a';
        System.out.println(++letter2);// pre increment, so 1 is added first, then the expression finishes
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);

        char digits = '9';// this is character 9, the digit, not number 9
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits);//prints character
        System.out.println((int)digits);// cast the charcter to int, which mean that prinys the ascii number for that charchter

        System.out.println(65);




    }
}
