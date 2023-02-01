package day22_array;

import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
        String city1="Chicago";
        String city2="WestPalm";
        String city3="Miami";
        String city4="New York";
        String city5="Toronto";
        String city6="Houston";
        //make array to store the cities
        String[] cities={"Chicago", "WestPalm", "Miami", "New York", "Toronto", "Houston"};

        //access the cities one at the time

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);
        System.out.println(Arrays.toString(Arrays.copyOfRange(cities, 0, 3)));//TODO get it done

        System.out.println(cities[0]+", "+cities[2]);
        // print the whole array
        System.out.println(cities); // no readable, hash
        System.out.println(Arrays.toString(cities)); //Arrays.toString(cities); --> return your array object as in a String format

        }


    }

