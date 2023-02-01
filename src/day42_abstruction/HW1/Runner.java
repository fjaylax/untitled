package day42_abstruction.HW1;

import day42_abstruction.Library;

public class Runner {
    public static void main(String[] args) {
        Library obj1 = new Library();
        //obj1.getLibraryCard("Fair");

        try {
            obj1.borrow(true);
        } catch (FailToCheckOutException e) {
            e.printStackTrace();
        }


    }}
