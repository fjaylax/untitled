package day16_strings;

public class StringPractice2AppleBanana {
    public static void main(String[] args) {
        String input1="apple";
        //             01234
        String input2="banana";
        //             012345
        /*String s="Infinity";
        //        01234567
        System.out.println(s.substring(3));//inity
        System.out.println(s.substring(5));//ity
        System.out.println(s.substring(7));//y

        //System.out.println(s.substring(9));//index 9 is not valid  stops the programm
        */
        System.out.println(input1.substring(1)); //pple
        System.out.println(input2.substring(0,5));//banan
    }
}
