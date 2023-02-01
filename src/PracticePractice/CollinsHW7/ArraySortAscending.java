package PracticePractice.CollinsHW7;

import java.util.Arrays;

public class ArraySortAscending {

    public static void main(String[] args) {



        int[] arr = {10, 9,1,9,9, 8, 7,6,4};
        System.out.println(Arrays.toString(ascending(arr)));

        //    arr = Sort(arr);         ==>{ 7, 8, 9, 10};


    }

    public static int[] ascending(int[] number){



        for (int i = 0; i < number.length; i++) {


            for (int j = 0; j < number.length; j++) {
                int sort=0;
                if(number[i]<number[j]){ // todo > descending
                    sort=number[i];
                    number[i]=number[j];
                    number[j]=sort;

                }
            }


        }


        return number;

    }





}
