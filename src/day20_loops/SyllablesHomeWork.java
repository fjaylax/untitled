package day20_loops;

import java.util.Scanner;

public class SyllablesHomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word with dashes");
        String word = scan.nextLine();
        int count = 0;

        if (word.length() > 0){
            count = 1;
        }

        for (int i = 0; i < word.length(); i++) {
            char eachWord = word.charAt(i);

            if (eachWord == '-'){
                count++;
            }
        }

        System.out.println("Syllables: " + count);


/*
String str = "Di-a-bol-i-cal";
        int syllables = 0;

        for (int i = 0; i < str.length(); i++) {

            if (("" + str.charAt(i)).equals("-")){
                syllables++;
            }

        }
        syllables += 1;
        System.out.println("Syllables = " + syllables);
 */




    }
}
