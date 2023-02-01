package day25_array_class;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={6,23,100,240,2000};
        System.out.println(Arrays.binarySearch(arr,240));//3
        System.out.println(Arrays.binarySearch(arr,241));//-5
        System.out.println(Arrays.binarySearch(arr,242 ));//-5

        System.out.println("-------");

         String [] words={"hello","world","zebra","water"};
         Arrays.sort(words);
        System.out.println(Arrays.toString(words));//[hello, water, world, zebra]
        System.out.println(Arrays.binarySearch(words,"hello"));//0
        System.out.println(Arrays.binarySearch(words,"Hello"));//-1 (Caps first)

    }
}
