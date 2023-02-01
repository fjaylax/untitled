package day10_if_statements;

public class LetterType {
    public static void main(String[] args) {
        // p
        // letter

        //6
        //number

        // $

        char c = 't';
        boolean isLetter = (c>= 'A' && c <= 'Z') || (c>= 'a' && c<= 'z');
        boolean isNumber = c >= '0' && c <= '9';
        if (isLetter){
            System.out.println(c+ " is letter");

            if (isNumber){
                System.out.println(c+ "is number");
                if (!isLetter && !isNumber){
                    System.out.println(c+ "is special character");

                }
            }
        }

    }
}
