package day23_array;

import java.util.Arrays;

public class MoveZerosHomeWork {

    public static void main(String[] args) {
        /*
        Move Zeros

	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position

Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]

         */
        int[]nums={10, 0, 5, 0, 1, 0};
        int[]newNums=new int[6];
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                newNums[index++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(newNums));
    }
}
