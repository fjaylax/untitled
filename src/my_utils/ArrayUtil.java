package my_utils;

import java.util.Arrays;

public class ArrayUtil {
    private static String[] arr;
    private static String element;


    /* Group of utility methods from aarays
}
}
}
     */

    public static void main(String[] args) {
        /**
         * takes the array of integer anr return summary of all elements of this array
         * @param arr array of int
         * @return summary of all elements of our array
         */
    }
    public static int sumArray ( int[] arr){

        int summ = 0;
        for (int each : arr) {
            summ += each;
        }
        return summ;
    }


    /*   create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */
    public static int[] addElement ( int[] arr, int num){

        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = num;

        return newArray;
    }


    /*  create a method that will accept an int array and return the smallest number from the array  */
    public static int minNumber ( int... arr){

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /*create a method that will accept an int array and return the biggest number from the array  */
    public static int maxNumber(int... arr) {

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    /*  create a method that will accept an int array and an int number. Check and return if the given number is in the array. */
    public static boolean isContains (int[] arr, int num) {

        for (int each : arr) {
            if (num == each) {
                return true;
            }
        }
        return false;
    }


    /*  IndexOf
        create a method that will accept an int array and an int number. Find and return the index of the number in the array.
        If there is multiple occurrence return the first occurrence's index

    */


    /*  IndexOf
    overload the indexOf method to work with String array and String element
*/
    public static int indexOf(int [] arr, int num) {

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){ // every number from the array with the number we are look for
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(int[] arr, int target, int startIndex){
        for(int i = startIndex; i < arr.length; i++){
            if(arr[i] == target){ // every number from the array with the number we are look for
                return i;
            }
        }

        return -1;
    }




    /*  Add Element
    create a method that will accept a String array and a String element. Add the given element value into the end of the array.

     */

    public static String[] addElement(String[] arr, String element){

        String[] newArr = new String[arr.length + 1]; // create an array with an extra size

        for(int i = 0; i < arr.length; i++){ // adds all the elements from the original array to the new array
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = element; // add the new element to the end of the new array

        return newArr;
    }

    /*
    Add Element

        overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.

        Ex:
            {"today", "is", "monday"}
            {"no", "softskills", "today"}

        output > [today, is, monday, no, softskills, today]
             */

    public static String[] addElement(String[] original, String[] other){

        String[] merged = new String[original.length + other.length];

        for(int i = 0; i < original.length; i++) { // copy the elements from the original array to the new array
            merged[i] = original[i];
        }

        // option: int i = 0, j = original.length; j++ --> merged[j]
        for(int i = 0; i < other.length; i++){ // read the elements from the other array and store them into the merged array
            merged[original.length + i] = other[i];
        }
//[today, is, monday, no, softskills, today]
        return merged;
    }


}


