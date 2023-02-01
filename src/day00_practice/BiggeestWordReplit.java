package day00_practice;

import java.util.Arrays;
import java.util.Scanner;

public class BiggeestWordReplit {




        public static void main(String[] args) {

            /*  Given a String [] words, find and print the longest word in the array. You can assume the elements will have different lengths.
             */

            //   String Array
            //   using for loop (for - each loop)  will take avery word and check length  of each word
            //

            Scanner input = new Scanner(System.in);
            String[] word = new String[5];    // String [] str = {"Mama", "Papa", "..... }

            for (int i = 0; i < 5; i++) {         // for loop       // i - index iteration
                // i = 0        word[0]
                // i = 1        word[1]
                // i = 2        word[2]
                System.out.println("Enter the word");
                word[i] = input.next();
            }
            System.out.println(Arrays.toString(word));

//
//        int maxLength = 0;
//        String maxWord = "";
//
//        for (String  eachWord  : word) {                // for-each loop
////           String  eachWord  : array type
//
//            if (eachWord.length() > maxLength) {
//                maxLength = eachWord.length();
//                maxWord = eachWord;
//            }
//        }


            int maxLength = word[0].length();
            String maxWord = word[0];

            for (int i = 1; i > word.length -1; i++) {

                if (word[i].length() > maxLength) {
                    maxLength = word[i].length();
                    maxWord = word[i];
                }
            }

            System.out.println("Longest word:" + maxWord + " with length " + maxLength);

        }

    }

