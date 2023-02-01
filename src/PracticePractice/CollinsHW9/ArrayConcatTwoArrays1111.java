package PracticePractice.CollinsHW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConcatTwoArrays1111 {

            public static void main(String args[])
        {
            Object str1[] = { "1", "1", "I" };          //source array
            Object str2[] = { 0, 3 };               //destination array
            List <Object> list = new ArrayList(Arrays.asList(str1)); //returns a list view of an array
//returns a list view of str2 and adds all elements of str2 into list
            list.addAll(Arrays.asList(str2));
            Object[] str3 = list.toArray();         //converting list to array
            System.out.println(Arrays.toString(str3));  //prints the resultant array
        }
    }

