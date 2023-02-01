package PracticePractice.CollinsHW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemovesomevalues {

    /*

    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.




     */


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 58, 200, 150, 300));

        List<Integer> result = new ArrayList<>();

        for (Integer each : list) {

            if (each > 100) {
                continue;
            }
            result.add(each);

        }
        System.out.println(result);


    }
}