package PracticePractice.CollinsHW9;

import java.util.ArrayList;

public class ArrayListRemoveAhmed {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Ahmed");
        list.add("John");
        list.add("Eric");
        list.add("Ahmedur");

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {

            if (each.equals("Ahmed")) { //contains(equals)
                continue;
            }
            result.add(each);


        }


        System.out.println(result);
    }
    }
