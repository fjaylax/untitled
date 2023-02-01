package day20_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
        Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */


            /*Scanner scan = new Scanner(System.in);
            System.out.println("Write a sentence");
            String s = scan.nextLine();

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                char words = s.charAt(i);


                if (words == ' ') {
                    count++;
                }

            }
            count += 1;
            System.out.println(count);

        }
    }

*/
       /* Scanner s = new Scanner(System.in);
        System.out.println("Type your text");
        String txt = s.nextLine();
        int wordCount = 1;

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("Words in your text --> " + wordCount);
*/


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s1 = input.nextLine().trim();
        int count = 0;

        for (int i = 0; i < s1.length(); i++){
            char letter = s1.charAt(i);
            if(letter == ' '){
                count++;

            }
        }
        System.out.println(count + 1);
    }
}


/*
String str="This has multiple words";
        int count=0;
        for (int i=0; i<str.length(); i++){
            if(str.substring(i).startsWith(" "))
                count++;
        }
        System.out.println(count+1);
 */