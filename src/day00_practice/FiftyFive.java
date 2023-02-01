package day00_practice;

import java.util.Scanner;

public class FiftyFive {
    public static void main(String[] args) {
        /*  Given an int [] nums, print true if the array has a 5 that is also next to another 5. Both conditions need to be met otherwise print false
                Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.

         */


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()}; // len = 5
        //  [1, 5, 4, 1, 5]
        //   0  1  2  3  4

        boolean isTrue = false;

        for (int i = 0; i < nums.length - 1 ; i++) {

            // i = 0
            // i = 1
            // i = 2
            // i = 3

            if (nums[i] == 5 && nums[i+1] == 5) {
                isTrue = true;
            }
        }

        System.out.println(isTrue);

    }
}

