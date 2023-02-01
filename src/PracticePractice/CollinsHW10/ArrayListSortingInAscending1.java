package PracticePractice.CollinsHW10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingInAscending1 {
    public static void main(String[] args) {
        // Get the ArrayList
        ArrayList<String>
                list = new ArrayList<String>();

        // Populate the ArrayList
        list.add("111");
        list.add("123");
        list.add("113");
        list.add("cbb");
        list.add("ddd");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: "
                + list);

        // Sorting ArrayList in ascending Order
        // using Collection.sort() method
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList "
                + "in Ascending order : "
                + list);
    }



}
