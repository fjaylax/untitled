package day19_loops;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
       /*
        write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
        */


        Scanner input = new Scanner(System.in);
        int numOfColors = 0;
        String colors = "";
        while (numOfColors < 3) {
            System.out.println("enter the next colors");
            String inputColors = input.nextLine();
            if (!colors.contains(inputColors)) {// if the color is unique, color does not have the value already
                colors += " " + inputColors;
                numOfColors++;


            }
            System.out.println(colors);
        }
    }
}