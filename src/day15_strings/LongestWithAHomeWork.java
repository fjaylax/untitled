package day15_strings;


import java.util.Scanner;


public class LongestWithAHomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words:");
        String first = input.nextLine();
        String second = input.nextLine();
        String third = input.nextLine();
        String longestWord = "";
        if (first.contains("a")) {
            longestWord = first;
        }
        if (second.contains("a") && second.length() > longestWord.length()) {
            longestWord = second;
        }
        if (third.contains("a") && third.length() > longestWord.length()) {
            longestWord = third;
        }
        System.out.println(longestWord);
        /*
         Find and print the longest word that also contains 'a'
	Ex:
		"java"
		"mouse"
		"computer"
	Output: java
Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
         */
    }


    }


