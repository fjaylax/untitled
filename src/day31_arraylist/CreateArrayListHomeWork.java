package day31_arraylist;

import java.util.ArrayList;

public class CreateArrayListHomeWork {
    public static void main(String[] args) {
       /*
        Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
        */


        ArrayList<String> elements = new ArrayList<>();
        elements.add("Hat");
        elements.add("Shoes");
        elements.add(1,"Jacket");
        System.out.println(elements);
        elements.add(0,"Towel");
        System.out.println(elements);
        elements.add(1,"Car");
        System.out.println(elements);




    }
}
