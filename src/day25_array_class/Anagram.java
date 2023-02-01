package day25_array_class;

import java.util.Arrays;

public class Anagram {

    /*
    anagram : u can rearrange letters and do another word

     */
    public static void main(String[] args) {

        // lets look just for same chars. logic while loop , check next char
        // sort them
        // 2 char arrays
        String word1 = "listen";
        String word2 = "silent";
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Arrays.sort((first));
        Arrays.sort(second);
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        if (Arrays.equals(first, second)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");

        }
        System.out.println(Arrays.equals(first,second)?"anagram" : "not anagram");
    }
}