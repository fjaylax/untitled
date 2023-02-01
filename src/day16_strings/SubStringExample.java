package day16_strings;

public class SubStringExample {
    public static void main(String[] args) {
        String s="Infinity";
        //        01234567
        System.out.println(s.substring(3));//inity
        System.out.println(s.substring(5));//ity
        System.out.println(s.substring(7));//y

        //System.out.println(s.substring(9));//index 9 is not valid  stops the programm

        System.out.println(s.substring(0));// whole word infinity

        System.out.println(s.substring(7));//y
        System.out.println(s.substring(1,6));//nfini
        System.out.println(s.substring(0,1));//i sane as charAt(0)

        System.out.println(s.substring(3,7));//init

        System.out.println(s.substring(3,8));//ok
       // System.out.println(s.substring(3,9)); not good, stops program
        System.out.println(s.substring(8));//prints nothing


    }
}
