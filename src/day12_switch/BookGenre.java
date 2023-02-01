package day12_switch;

import java.util.Scanner;

public class BookGenre {
    public static void main(String[] args) {
     /*
        You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.

      Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

     Make variables for all of that information. Given empty defaults for all the variables

       Data based on genre:
        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

         genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
average page length, average profit, average number of sequels, average number of countries published in
      */
        String genre = "";
        int pageLength = 0;
        double profit = 0;
        int sequels = 0;
        int countries = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your genre:");
        genre = input.nextLine();

        switch (genre) {
            case  "Short Stories":
                pageLength=150;profit=300_000;sequels=1;countries=40;
                break;
            case "Science Fiction":
                pageLength=720;profit=900_500;sequels=4;countries=30;
                break;
            case "Detective":
                pageLength=350;profit=700_000;sequels=3;countries=45;
                break;
            case "Fantasy":
                pageLength=500;profit=1_000_000;sequels=5;countries=50;
                break;
                default:
                System.out.println("Invalid entry");
          }
          if (profit!=0&&pageLength!=0&&sequels!=0&&countries!=0)
              System.out.println("Genre:" + genre + ". Page length: " + pageLength + ". " + sequels +
             " sequels  were printed in " + countries + " countries. And total profit from the sale was $" + profit);
        }

    }








