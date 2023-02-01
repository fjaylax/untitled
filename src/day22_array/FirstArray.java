package day22_array;

public class FirstArray {
    public static void main(String[] args) {
        int[] nums; //declaring array
        nums = new int[5];// initializing array with 5 spaces
        //so far this out array: [0,0,0,0,0]
        //                        0 1 2 3 4
        System.out.println(nums[0]);// acces one element the first element
        //change the first to be 10
        nums[0]=10;//asigning the value 10 in position oft he array
        System.out.println(nums[0]);// prints 10


        nums[3]=25;
        System.out.println(nums[3]);

        //at this point thw whole array;[10,0,0,25,0]

        //declaring and initializing with the value:
        int[] other={5,7,10,-8,20,12};
        System.out.println(other[0]);//5
        System.out.println(other[1]);//7

    }
}
