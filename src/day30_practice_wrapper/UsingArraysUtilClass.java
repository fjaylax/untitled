package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {
    public static void main(String[] args) {




        int num=ArrayUtil.minNumber(1,3,5,2,-3,56);
        System.out.println(num);
        //or System.out.println(ArrayUtil.minNumber(1,3,5,2,-3,56));

        System.out.println("______________________________________");

        int num1=ArrayUtil.maxNumber(1,3,5,2,-3,56);
        System.out.println(num1);
        //or System.out.println(ArrayUtil.maxNumber(1,3,5,2,-3,56));

        System.out.println("______________________________________");

        // another way to make array:
        int[]a = {45, 2, 6, 2, 6, 23, 83, 12}; // make array object
        System.out.println(ArrayUtil.maxNumber(a));

        System.out.println(ArrayUtil.maxNumber(new int[]{4, 5, 2, 5, 2}));

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        //call isContains
        int[]b={4,5,6,12,3,12};
        System.out.println(ArrayUtil.isContains(b,12));// returns true
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        //call indexOf
        int[]c={4,2,5,1,6};
        System.out.println(ArrayUtil.indexOf(c,5));//2
        System.out.println(ArrayUtil.indexOf(c,7));//-1
        System.out.println("index of 5: " + ArrayUtil.indexOf(c, 5));
        System.out.println("index of 7: " + ArrayUtil.indexOf(c, 7));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

//call overloaded indexOf


        System.out.println("overloaded use:");
        int[]d = {4, 5, 1, 6, 1, 6, 3, 5, 4, 1};
        System.out.println("index of first 6: " + ArrayUtil.indexOf(d, 6));
        System.out.println("index of second 6: " + ArrayUtil.indexOf(d, 6, 4));

        int firstIndex = ArrayUtil.indexOf(d, 6); // same as line 39
        int secondIndex = ArrayUtil.indexOf(d, 6, firstIndex + 1); // same as line 40

        System.out.println("----------------\nAdd element method");

        String[] words = {"java", "is", "the", "best"};
        // I want to add: language into the array
        String[] allWords = ArrayUtil.addElement(words, "language");
        System.out.println(Arrays.toString(allWords));

        System.out.println("----------------\nAdd element method");

        String[] strs = {"today", "is", "tuesday"};
        String[] other = {"no", "softskills", "today"};

        String[] multipleAdded = ArrayUtil.addElement(strs, other);
        System.out.println(Arrays.toString(multipleAdded));


    }

}




