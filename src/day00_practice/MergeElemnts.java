package day00_practice;

import java.util.Arrays;

public class MergeElemnts {


    /*
    Given a 2D int array merge the elements into one 1D array

Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]
     */
    public static void main(String[] args) {

        int [][] nums = {
                {10, 20, 30, 60, 99},
                {5, 10, 15}
        };

        int len = nums[0].length + nums[1].length;
        int[] newArray = new int[len];

        int count = 0;

        for (int[] innerArray : nums) {             // each inner array
            for (int eachNum : innerArray) {        // each number of inner array

                newArray[count] = eachNum;          // assign each element of the new array
                count ++;                           // counter
            }
        }

        System.out.println(Arrays.toString(newArray));

    }

}