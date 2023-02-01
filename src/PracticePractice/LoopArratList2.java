package PracticePractice;

import java.util.ArrayList;

public class LoopArratList2 {
    public static void main(String[] args) {
        /*Try to loop:

        Create an ArrayList of Double elements
        Fill the ArrayList with some values
        Find the max element from the ArrayList

         */

        ArrayList<Double> number = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            number.add(Math.random() * 100);

        }

        System.out.println(number);
        double max = number.get(0);
        for (Double each : number) {
            if (each > max) {

            }





        }
        System.out.println("Max= "+max);
    }
}
