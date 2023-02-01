package PracticePractice.Collins12;

import java.util.*;

public class MinValueMap2 {

    public static void main(String[] args) {

        Map<String, Integer> map
                = new HashMap<String, Integer>();

        // Putting key-value pairs in map
        map.put("A", 4);
        map.put("B", 15);
        map.put("C", 6);
        map.put("D", 55);
        System.out.println("minValue((map)) = " + minValue((map)));
    }

    public static List<Map.Entry<String, Integer>> minValue(Map<String, Integer> map1) {

        List<Map.Entry<String, Integer>> output = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            if (output.size() == 0) {
                output.add(e);
            } else if (e.getValue() <= output.get(0).getValue()) {
                output.clear();
                output.add(e);
            } else if (e.getValue() == output.get(0).getValue()) {
                output.add(e);
            }
        }

            return output;
        }

    }


/*

Create a list of output entries. for-each loop over your entries. If your list is empty; add the entry. If it's not; check if the size of the entry is the same as the first one. If it's the same also add that entry. If it's smaller; clear the list and add the entry. If it's larger just continue
 */