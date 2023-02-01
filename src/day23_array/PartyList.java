package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    /*
    we are throwing a party, we want to gather all the name
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming to the party?");
        int size = input.nextInt();

        String[] names = new String[size]; // new String[input.nextInt()];
        System.out.println(Arrays.toString(names)); // showing the empty array created, based on the size from the console

        for(int i = 0; i < names.length; i++){ // purpose: ask for the name, and store to the array
            System.out.println("Enter the name of person " + (i + 1)); // if you don't have parenthesis the line will concatenate left to right, but we want to do addition first i + 1, then concatenate the message
            String guest = input.next();
            names[i] = guest; // names[i] = input.next();
        }
        System.out.println("Final list coming to the party");
        System.out.println(Arrays.toString(names));

    }

    public static class ReverseArray {
        public static void main(String[] args) {
            /*
            Reverse Array
        Write a program that will reverse the order of any given array
            Ex:
            Input:
                [1, 2, 3, 4, 5]
            Output:
                [5, 4, 3, 2, 1]
             */

            int[]nums={1, 2, 3, 4, 5};
            int[]reverseNum=new int[5];
            for (int i=0;i< nums.length;i++){
                reverseNum[i]=nums[nums.length-(i+1)];
            }
            System.out.println(Arrays.toString(reverseNum));
    // use i variable that is going backwards to read from the original array - index for arr array
    //        // use y variable that is going forwards to store into the reverse array - index for reverse array
            /*

    int i = last index
        int y = 0;

        while(i >=  0){
            i--
            y++
     */
        }
    }
}









