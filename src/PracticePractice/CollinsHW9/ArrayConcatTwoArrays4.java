package PracticePractice.CollinsHW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayConcatTwoArrays4 {
    public static void main(String[] args) {
        String[] arr1 = {"1,2,3"};
        String[] arr2 = {"4,5,6"};
        System.out.println(Arrays.asList(concatWithCollection(arr1, arr2)));

    }

    public static List<String> concatWithCollection(String [] array1, String[] array2) {
        List<String> resultList = new ArrayList<>(array1.length + array2.length);
        Collections.addAll(resultList, array1);
        Collections.addAll(resultList, array2);
        return resultList;
    }







}
