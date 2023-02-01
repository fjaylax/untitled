package PracticePractice.CollinsHW7;

public class ArrayFindMinimum {

    public static void main(String[] args) {

        // create an array of int type
        int[] arr = {4, 2, -55,5, 3, 6,-2, -22};

        // assign first element of array as minimum value
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // compare all elements with min
            // assign minimum value to min
            min = Math.min(min, arr[i]);

        }

        System.out.println("Minimum Value: " + min);
    }



}

//In the above example, we have created an array named arr. Initially, the variable min stores the first element of the array.
//
//Here, we have used the for loop to access all elements of the array. Notice the line,
//
//min = Math.min(min, arr[i])
//The Math.min() method compares the variable min with all elements of the array and assigns the minimum value to min.