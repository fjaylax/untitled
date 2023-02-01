package day00_practice;


import java.util.Scanner;

public class JavaAndPythonsReplit {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toLowerCase();

        int countJava = 0;
        int countPython = 0;
        for (int i =0; i<= sentence.length()-4;i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                countJava++;
            }
        }
        for (int i=0; i<= sentence.length()-6; i++){
            if (sentence.substring(i, i+6).equals("pythons")){
                countPython++;




            }
        }
        System.out.println(countJava==countPython);

    }
}