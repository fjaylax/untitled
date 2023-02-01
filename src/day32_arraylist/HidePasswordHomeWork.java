package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePasswordHomeWork {
    /*
    Hide passwords

Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]



     */



        public static void main(String[] args) {

            ArrayList<String> passList = new ArrayList<>(Arrays.asList("one", "hi", "hold", "fiveveve"));
            ArrayList<String>  newList = new ArrayList<>();

            System.out.println(passList);

            for (String word : passList) {
                String str = "";
                for (int i = 0; i < word.length(); i++) {
                    str += "*";
                }
                newList.add(str);
            }

            System.out.println(newList);
        }
    }






