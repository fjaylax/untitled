package day23_array;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        int[] nums = {4, 213, 6};
        //print whole aaaray
        System.out.println(Arrays.toString(nums));//[4, 213, 6]

        //print separate onm each line
        System.out.println(nums[2]);//6

        //printing each with loop
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);


        }
        // create our own printing format:
        String arrayAsString = "Array ~ ";
        for (int i = 0; i < nums.length; i++) {
            arrayAsString += nums[i] + " | ";
        }
        arrayAsString += "~ END";
        System.out.println(arrayAsString);


        //go through with each loop

        System.out.println("For each loop:");
        for (int eachNumber : nums) {// read every element from  the array
            System.out.print(eachNumber+"/");
        }
    }
}

