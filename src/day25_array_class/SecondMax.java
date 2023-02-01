package day25_array_class;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        /*
        find second biggest number
     [4,3,1,4,5,2,4,8,4,8]
out put 5
       */

        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Max number: " + nums[nums.length - 1]);
        System.out.println();

        int max = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] !=max){
                System.out.println("second max: "+nums[i]);
                break;
            }


        }
    }
}
