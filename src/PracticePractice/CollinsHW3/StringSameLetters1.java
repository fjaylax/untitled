package PracticePractice.CollinsHW3;

import java.util.Arrays;

public class StringSameLetters1 {
    public static void main(String[] args) {
        System.out.println("sameChars(\"abc\", \"abcca\") = " + sameChars("abc", "abcca"));

    }
   // String firstStr = "abc";
    //String secondStr = "acb";






         static boolean sameChars (String firstStr, String secondStr){
           if (firstStr.length()!=secondStr.length()){
           return false;
           }
            char[] first = firstStr.toCharArray();
            char[] second = secondStr.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            return Arrays.equals(first, second);
        }
    }


