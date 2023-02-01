package day16_strings;

public class MiddleCharPractice2 {
    public static void main(String[] args) {
        String input="qelephant";
        int len=input.length();
        if (len%2==0) {
            System.out.println(input.substring(len / 2 - 1, len / 2 + 1));
        }else{
            System.out.println(input.charAt(len/2));
        }





    }
}
