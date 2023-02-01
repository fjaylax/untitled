package PracticePractice.CollinsHM8;

public class Arraytozero {

    public static void main(String[] args) {
       sumZero(4);
    }

    static public int[] sumZero(int n) {

        // **** initialization ****
        int[] arr = new int[n];

        // **** determine if n is even or odd ****
        boolean even = (n % 2 == 0 ? true : false);

        // **** populate the array - O(n / 2) ****
        for (int i = 0; i < n / 2; i++) {

            // **** fill left cell ****
            arr[i] = (i + 1) * -1;

            // **** fill right cell ****
            arr[i + (n / 2) + (even ? 0 : 1)] = (i + 1);
        }

        // **** return arr[] ****
        return arr;
    }


 }