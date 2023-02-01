package day10_if_statements;

import java.util.Scanner;

public class ChooseLanguageHomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eng = 1, spa = 2, tur = 3, rus =4, fre = 5;
        System.out.println("Enter a number from 1 to 5 based on the language you want to use: " +
                "\n\t 1 - English " +
                "\n\t 2 - Spanish " +
                "\n\t 3 - Turkish"  +
                "\n\t 4 - Russists" +
                "\n\t 5 - French");
        int language = scan.nextInt();

        if (language == 1){
            System.out.println("\"Hello, thank you for your call\"");
        }else if (language == 2){
            System.out.println("\"Hola, gracias para llamar\"");
        }else if (language == 3){
            System.out.println("\"Merhaba, aradiginiz icin tesekkuler\"");
        }else if (language == 4){
            System.out.println("\"Privet, spasibo za vash zvonok\"");
        }else if (language == 5){
            System.out.println("\"Merci, pour votre appel");
        }else{
            System.out.println("\"We will English as default\"");
        }
    }
}


             /*  String message = " ";
        if (language == 1){
             message = "Hello, thank you for your call;
        }else if (language == 2){
            message = "Hola, gracias para llamar;
        }else if (language == 3){
            message = "Merhaba, aradiginiz icin tesekkuler;
        }else if (language == 4){
            message = "Privet, spasibo za vash zvonok;
        }else if (language == 5){
            message = "Merci, pour votre appel;
        }else{
            message = " We will English as default;

 */