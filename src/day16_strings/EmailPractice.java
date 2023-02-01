package day16_strings;

import java.util.Scanner;

public class EmailPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st word");
        String word1 = input.nextLine();
        System.out.println("Enter 2nd word");
        String word2 = input.nextLine();

        int len1= word1.length();
        int len2=word2.length();
        if (len1>=6 && len2>=6) {

            //String firstLetterLow=firstName.substring(0,1).toLowerCase();
            //String first3Last=lastName.substring(0,1).toUpperCase()+lastName.substring(1,3).toLowerCase();
String str1=word1.substring(0,4).toLowerCase();
String str2=word2.substring((len2-3),len2);// how da hell is this happened????
            System.out.println(str1+str2+"@cydeo.com");

        }else{
            System.out.println("Invalid data");





        }



    }
}
