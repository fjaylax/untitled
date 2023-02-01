package day31_arraylist;

import java.util.ArrayList;

public class ArrayListOfStringsHomeWorks {
    public static void main(String[] args) {
        /*
        Practice flow:

Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
         */

        ArrayList<String> str = new ArrayList<>();
        str.add("Iron Man");
        str.add("Spider Man");
        str.add("Thor");
        str.add("Captain America");
        str.add("Hawkeye");
        System.out.println(str);//[Iron Man, Spider Man, Thor, Captain America, Hawkeye]

        str.remove(2);
        System.out.println(str);//[Iron Man, Spider Man, Captain America, Hawkeye]
        str.remove("Iron Man");

        System.out.println(str);//[Spider Man, Captain America, Hawkeye]
        str.remove(0);
        System.out.println(str);//[Captain America, Hawkeye]








    }
}
