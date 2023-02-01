package day_50_functional_interface.homework;

import java.util.Arrays;
import java.util.function.Function;

public class Functional_testing_2 {
    public static void main(String[] args) {
        //        Use Function functional interface to:
//        1.2 Create a function that can return the reversed version of a String array

        Function<String[], String[]> reverseStringArray = (arr) -> {

            String[] newArr = new String[arr.length];
            int j = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                newArr[j++] = arr[i];
            }

            return newArr;
        };

        String[] arr = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(reverseStringArray.apply(arr)));

    }
}