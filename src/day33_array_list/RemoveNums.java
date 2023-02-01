package day33_array_list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(1, 5, 2, 5, 2, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

        //remove all number thta are less thn 5

        for (int i=0;i<nums.size();i++){
            if (nums.get(i)<5){
                nums.remove(i);
              i--;

            }
        }
        System.out.println(nums);


//-----------------------
        ArrayList<Integer> nums2 =new ArrayList<>(Arrays.asList(1, 5, 2, 5, 2, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));
        //remove all numbers <5 using removeIf()
        nums2.removeIf(n->n<5);
        System.out.println(nums2);

    }
}
